package com.crud.example.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByname(String name);
	
	Product deleteByName(String name);
	


}
