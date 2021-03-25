package com.discarok.store.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discarok.store.Model.ProductType;
import com.discarok.store.Repositories.ProductTypeRepository;
import com.discarok.store.Service.interfaces.ServiceInterface;

@Service
public class ProductTypeService implements ServiceInterface<ProductType, Integer>{
	
	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	@Override
	public ProductType findById(Integer id) {
		// TODO Auto-generated method stub
		return productTypeRepository.findById(id).orElse(null);
	}

	@Override
	public List<ProductType> findAll() {
		// TODO Auto-generated method stub
		return (List<ProductType>) productTypeRepository.findAll();
	}

	@Override
	public ProductType save(ProductType t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
