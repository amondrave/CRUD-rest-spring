package com.discarok.store.Controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discarok.store.Model.Product;
import com.discarok.store.Service.impl.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> getProducts(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id){
		Optional<Product> product = Optional.ofNullable(service.findById(id));
		if(product.isPresent()) return ResponseEntity.ok(product.get());
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		Product productSave = service.save(product);
		
		try {
			return ResponseEntity.created(new URI("/product/"+productSave.getId())).body(productSave);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
 