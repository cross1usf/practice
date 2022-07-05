package com.example.springhateoas.controller;

import com.example.springhateoas.model.Order;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    /*@GetMapping("/{customerId}/orders")
    public CollectionModel<Order> getOrdersForCustomer(@PathVariable String customerId) {
        Order order = new Order("1", 1D, 3);

    }*/

    @GetMapping("/{customerId}/allOrders")
    public Order getOrderByCustomer(@PathVariable String customerId) {
        return new Order("2",5.0D,3);
    }
}
