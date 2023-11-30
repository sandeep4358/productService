package com.javafruit.Productservice.repository;


import com.javafruit.Productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
