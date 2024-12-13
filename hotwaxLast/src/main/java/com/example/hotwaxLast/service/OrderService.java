package com.example.hotwaxLast.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotwaxLast.entities.OrderHeader;
import com.example.hotwaxLast.repository.OrderHeaderRepository;
import com.example.hotwaxLast.repository.OrderItemRepository;

@Service
public class OrderService {
    @Autowired
    private OrderHeaderRepository orderHeaderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderHeader createOrder(OrderHeader order) {
        return orderHeaderRepository.save(order);
    }

    public Optional<OrderHeader> getOrderById(int id) {
        return orderHeaderRepository.findById(id);
    }

    public void deleteOrder(int id) {
        orderHeaderRepository.deleteById(id);
    }
}