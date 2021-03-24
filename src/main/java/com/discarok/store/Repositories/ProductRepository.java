package com.discarok.store.Repositories;


import org.springframework.data.repository.CrudRepository;

import com.discarok.store.Model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{

}
