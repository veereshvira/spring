package com.build.phase1.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.build.phase1.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
