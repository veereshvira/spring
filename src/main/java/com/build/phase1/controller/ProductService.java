package com.build.phase1.controller;

import java.util.List;

import com.build.phase1.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> fetchProductList();

	public Product fetchProductById(Long productId);

	public void DeleteProductById(long productId);

}
																																																																																																																																																																																																																																																																																																																																																																																																																																		