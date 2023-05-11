package com.crud.example.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.example.entity.Product;
import com.crud.example.repositroy.ProductRepository;



@Service
public class ProductServies {

	@Autowired
	private ProductRepository repository;

	// ***********************************post method*********************
	// ek product mate
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	// vadhu product mate
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}

	// *******************************get method*****************************//

	// product
	public List<Product> getProducts() {

		return repository.findAll();
	}

	// Product by id

	public Product getProductbyid(int id) {
		return repository.findById(id).orElse(null);
	}

	// Product by name
	public Product getProductbyname(String name) {

		return repository.findByname(name);
	}

	// *****************************put method**********************************//

	public Product update(Product product) {

		Product p = repository.getById(product.getId());
		p.setName(product.getName());
		p.setQuantity(product.getQuantity());
		p.setPrice(product.getPrice());

		return repository.save(p);
	}

	// **********************************Delet kar va mate *********************//

	public String delete(int id) {
		repository.deleteById(id);
		return "Deleted successfully";
	}

	public String deleteAll() {
		repository.deleteAll();
		return "Deleted Sucessfully";
	}
	
	

}
