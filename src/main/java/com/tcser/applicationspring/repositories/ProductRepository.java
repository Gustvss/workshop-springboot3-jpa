package com.tcser.applicationspring.repositories;

import com.tcser.applicationspring.entities.Category;
import com.tcser.applicationspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
