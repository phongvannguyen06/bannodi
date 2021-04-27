package com.bannodi.orderservice.service;

import com.bannodi.orderservice.model.Order;
import com.bannodi.orderservice.repository.OrderItemDetailRepository;
import com.bannodi.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderService {

    private OrderRepository orderRepo;
    private OrderItemDetailRepository orderItemDetailRepo;

    @Autowired
    public OrderService(OrderRepository orderRepo, OrderItemDetailRepository orderItemDetailRepo) {
        this.orderRepo = orderRepo;
        this.orderItemDetailRepo = orderItemDetailRepo;
    }

    public Order addOrder(Order newOrder) {
        return this.orderRepo.save(newOrder);
    }

    public List<Order> getAllOrders() {
        return this.orderRepo.findAll();
    }

    public List<Order> getAllOrdersOfUser(long userId) {
        return this.orderRepo.findOrdersByUserId(userId);
    }

    public Order updateOrder(long orderId, Order order) {
        order.setId(orderId);
        return this.orderRepo.save(order);
    }

    public void deleteOrder(long orderId) {
        this.orderRepo.deleteById(orderId);
    }


}
