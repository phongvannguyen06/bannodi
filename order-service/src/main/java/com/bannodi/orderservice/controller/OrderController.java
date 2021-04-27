package com.bannodi.orderservice.controller;

import com.bannodi.orderservice.model.Order;
import com.bannodi.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{userId}")
    public List<Order> getAllOrdersOfUser(@PathVariable long userId) {
        return this.orderService.getAllOrdersOfUser(userId);
    }

    @PostMapping
    public Order addOrder(@RequestBody Order newOrder) {
        return this.orderService.addOrder(newOrder);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(@PathVariable long orderId, @RequestBody Order order) {
        return this.orderService.updateOrder(orderId, order);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable long orderId) {
        this.orderService.deleteOrder(orderId);
    }
}
