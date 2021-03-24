package com.discarok.store.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<List<ProductType>> getAllProuductsType(){
		return ResponseEntity.ok(service.findAll());
	}
}
