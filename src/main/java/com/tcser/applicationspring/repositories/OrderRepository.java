package com.tcser.applicationspring.repositories;

import com.tcser.applicationspring.entities.Order;
import com.tcser.applicationspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
