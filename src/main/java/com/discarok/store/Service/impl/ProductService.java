package com.discarok.store.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discarok.store.Model.Product;
import com.discarok.store.Repositories.ProductRepository;
import com.discarok.store.Service.interfaces.ServiceInterface;

@Service
public class ProductService implements ServiceInterface<Product, Integer>{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>)productRepository.findAll();
	}

	@Override
	public void save(Product t) {
		// TODO Auto-generated method stub
		productRepository.save(t);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

}
