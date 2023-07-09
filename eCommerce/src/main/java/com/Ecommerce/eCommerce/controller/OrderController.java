package com.Ecommerce.eCommerce.controller;

import com.Ecommerce.eCommerce.model.Order;
import com.Ecommerce.eCommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public void addOrder (@RequestBody Order order){
        orderService.addOrder(order);
    }

    @GetMapping("order/{Id}")
    public Optional<Order> getOrder(@PathVariable Integer Id){
        return orderService.getOrderById(Id);
    }
}