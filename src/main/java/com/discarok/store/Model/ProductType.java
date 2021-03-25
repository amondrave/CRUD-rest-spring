package com.discarok.store.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author discarok
 *
 */


@Entity
@Table(name = "product_types")
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name", length = 20, nullable = false, unique = true)
	private String name;
	
	
	
	
	// construct

	public ProductType(int id, String name ){
		super();
		this.id = id;
		this.name = name;

	}
	
	public ProductType() {
		
	}

	// getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
}
