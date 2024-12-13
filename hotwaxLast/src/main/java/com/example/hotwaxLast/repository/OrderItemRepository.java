package com.example.hotwaxLast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotwaxLast.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
