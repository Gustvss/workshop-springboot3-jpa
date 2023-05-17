package com.tcser.applicationspring.services;

import com.tcser.applicationspring.entities.Order;
import com.tcser.applicationspring.entities.User;
import com.tcser.applicationspring.repositories.OrderRepository;
import com.tcser.applicationspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
