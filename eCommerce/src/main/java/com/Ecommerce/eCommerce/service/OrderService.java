package com.Ecommerce.eCommerce.service;

import com.Ecommerce.eCommerce.model.Order;
import com.Ecommerce.eCommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }
}