package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByName(String name);

}
