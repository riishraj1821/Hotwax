package com.example.hotwaxLast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotwaxLast.entities.OrderHeader;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Integer> {

}
