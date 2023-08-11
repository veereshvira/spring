package com.build.phase1.controller;		

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.build.phase1.Product;
	
@RestController
public class ProductController {
	
	@Autowired
	private ProductService  productService;
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/products")
	public List<Product> fetchProductList(){
		return productService.fetchProductList();
	}
																																																						
	@GetMapping("/products/{id}")
	public Product fetchProductById(@PathVariable("id") long productId) {
		return productService.fetchProductById(productId);
	}
	
	@DeleteMapping("/products/{id}")
	public String DeleteProductById(@PathVariable("id") long productId) {
		productService.DeleteProductById(productId);
		return "Product deleted Successfully";
	}
}

