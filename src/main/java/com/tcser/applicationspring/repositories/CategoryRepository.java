package com.tcser.applicationspring.repositories;

import com.tcser.applicationspring.entities.Category;
import com.tcser.applicationspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
