package com.example.springhateoas.model;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

public class Order extends RepresentationModel<Order> {

    protected String orderId;
    protected Double price;
    protected Integer quantity;

    public Order(String orderId, Double price, Integer quantity) {
        this.orderId = orderId;
        this.price = price;
        this.quantity = quantity;
    }


}
