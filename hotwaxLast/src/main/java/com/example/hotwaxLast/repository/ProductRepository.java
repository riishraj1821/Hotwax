package com.example.hotwaxLast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotwaxLast.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
