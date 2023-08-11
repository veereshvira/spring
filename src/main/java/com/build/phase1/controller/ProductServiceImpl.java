package com.build.phase1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.build.phase1.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> fetchProductList() {
		return productRepository.findAll();
	}

	@Override
	public Product fetchProductById(Long productId) {
		return productRepository.findById(productId).get();
	}

	@Override
	public void DeleteProductById(long productId) {
		productRepository.deleteById(productId);
	}

}
