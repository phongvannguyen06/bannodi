package com.bannodi.orderservice.repository;

import com.bannodi.orderservice.model.OrderItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDetailRepository extends JpaRepository<OrderItemDetail, Long> {
    List<OrderItemDetail> findOrderItemDetailsByOrder(long orderId);
}
