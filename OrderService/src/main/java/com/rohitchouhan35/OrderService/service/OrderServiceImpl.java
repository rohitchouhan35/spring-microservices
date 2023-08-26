package com.rohitchouhan35.OrderService.service;

import com.rohitchouhan35.OrderService.entity.Order;
import com.rohitchouhan35.OrderService.model.OrderRequest;
import com.rohitchouhan35.OrderService.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public long placeOrder(OrderRequest orderRequest) {

        // Order Entity -> Save tha data with status Order Created
        // Product Service - Block Products (Reduce Quantity)
        // Payment Service -> Payments -> Success -> Complete, else Cancelled
        log.info("Placing order request: {}", orderRequest);
        Order order = Order.builder()
                .amount(orderRequest.getTotalAmount())
                .orderStatus("CREATED")
                .productId(orderRequest.getProductId())
                .orderDate(Instant.now())
                .quantity(orderRequest.getQuantity())
                .build();
        order = orderRepository.save(order);
        log.info("Order placed successfully with order id : {}", order.getId());
        return order.getId();
    }
}
