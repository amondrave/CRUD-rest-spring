package com.discarok.store.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * 
 * @author discarok
 *
 */

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name", length = 100, nullable = false)
	private String name;
	

	@Column(name = "description", length = 100)
	private String description;
	
	@Column(name = "available")
	private boolean available;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private ProductType type;

	
	
	// Construct

	public Product(String name, String description, boolean available, ProductType type) {
		super();
		this.name = name;
		this.description = description;
		this.available = available;
		this.type = type;
	}
	
	public Product() {
		
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



	public String setDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public boolean isAvailable() {
		return available;
	}



	public void setAvailable(boolean available) {
		this.available = available;
	}



	public ProductType getType() {
		return type;
	}



	public void setType(ProductType type) {
		this.type = type;
	}
	
	
	

	

	
	
	
}
