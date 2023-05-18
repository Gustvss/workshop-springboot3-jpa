package com.tcser.applicationspring.repositories;

import com.tcser.applicationspring.entities.OrderItem;
import com.tcser.applicationspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
