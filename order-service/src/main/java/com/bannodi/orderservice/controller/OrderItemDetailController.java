package com.bannodi.orderservice.controller;

import com.bannodi.orderservice.model.OrderItemDetail;
import com.bannodi.orderservice.service.OrderItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders/items")
public class OrderItemDetailController {

    private OrderItemDetailService itemDetailService;

    @Autowired
    public OrderItemDetailController(OrderItemDetailService itemDetailService) {
        this.itemDetailService = itemDetailService;
    }

    @PostMapping
    public OrderItemDetail addItemDetail(@RequestBody OrderItemDetail itemDetail) {
        return this.itemDetailService.addItemDetail(itemDetail);
    }

    @GetMapping
    public List<OrderItemDetail> getAllItems() {
        return this.itemDetailService.getAllItems();
    }

}
