package com.rohichouhan35.ProductService.service;

import com.rohichouhan35.ProductService.model.ProductRequest;
import com.rohichouhan35.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);
}
