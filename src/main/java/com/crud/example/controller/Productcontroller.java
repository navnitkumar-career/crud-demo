package com.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.example.entity.Product;
import com.crud.example.servies.ProductServies;

@RestController
public class Productcontroller {

	@Autowired
	private ProductServies servies;

	

	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {

		return servies.saveProduct(product);
	}

	@PostMapping("/addproducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {

		return servies.saveProducts(products);
	}

	@GetMapping("/products")
	public List<Product> AllProduct() {

		return servies.getProducts();
	}

	@GetMapping("/ProductByid/{id}")
	public Product findbyid(@PathVariable int id) {

		return servies.getProductbyid(id);
	}

	@GetMapping("/Product/{name}")
	public Product findbtname(@PathVariable String name) {

		return servies.getProductbyname(name);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {

		return servies.update(product);

	}

	@DeleteMapping("/DeleteById/{id}")
	public String DeleteProductbyid(@PathVariable int id) {

		return servies.delete(id);
	}

	@DeleteMapping("/deleteall")
	public String deleteall() {

		return servies.deleteAll();
	}
	

}
