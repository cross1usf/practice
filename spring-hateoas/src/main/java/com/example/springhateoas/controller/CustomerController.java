package com.example.springhateoas.controller;

import com.example.springhateoas.model.Customer;
import com.example.springhateoas.model.Order;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{customerId}")
    public String getCustomerById(@PathVariable String customerId) {
        return new String("John Wick");

    }

    @GetMapping
    public CollectionModel<Customer> getAllCustomers() {
        List<Customer> allCustomers = new ArrayList<>();
        var customer = new Customer("1", "Billy", "Bob");
        String customerId = customer.getId();
        Link selfLink = linkTo(CustomerController.class).slash(customerId).withSelfRel();
        customer.add(selfLink);
        Link ordersLink = linkTo(methodOn(OrderController.class).getOrderByCustomer(customerId)).withRel("Customer orders");
        customer.add(ordersLink);
        allCustomers.add(customer);

        Link link = linkTo(CustomerController.class).withSelfRel();
        CollectionModel<Customer> result = CollectionModel.of(allCustomers,link);
        return result;
    }

}
