package com.rohitchouhan35.OrderService.service;

import com.rohitchouhan35.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
