package com.bannodi.orderservice.service;

import com.bannodi.orderservice.model.OrderItemDetail;
import com.bannodi.orderservice.repository.OrderItemDetailRepository;
import com.bannodi.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderItemDetailService {

    private OrderItemDetailRepository orderItemDetailRepo;

    @Autowired
    public OrderItemDetailService(OrderItemDetailRepository orderItemDetailRepo) {
        this.orderItemDetailRepo = orderItemDetailRepo;
    }

    public OrderItemDetail addItemDetail(OrderItemDetail itemDetail) {
        return this.orderItemDetailRepo.save(itemDetail);
    }

    public List<OrderItemDetail> getAllItems() {
        return this.orderItemDetailRepo.findAll();
    }

}
