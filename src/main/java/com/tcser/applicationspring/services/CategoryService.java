package com.tcser.applicationspring.services;

import com.tcser.applicationspring.entities.Category;
import com.tcser.applicationspring.entities.User;
import com.tcser.applicationspring.repositories.CategoryRepository;
import com.tcser.applicationspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
