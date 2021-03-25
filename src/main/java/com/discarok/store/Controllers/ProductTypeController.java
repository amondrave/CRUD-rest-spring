package com.discarok.store.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discarok.store.Service.impl.ProductTypeService;
import com.discarok.store.Model.ProductType;

@RestController
@RequestMapping("/producs-type")
public class ProductTypeController {

	@Autowired
	private ProductTypeService service;
	
	@GetMapping
	public ResponseEntity<List<ProductType>> getAllProductsType(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ProductType> getProductType(@PathVariable("id")Integer id){
		Optional<ProductType> producType = Optional.ofNullable(service.findById(id));
		if(producType.isPresent())return ResponseEntity.ok(producType.get()); 
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
