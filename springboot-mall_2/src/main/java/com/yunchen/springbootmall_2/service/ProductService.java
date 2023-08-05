package com.yunchen.springbootmall_2.service;

import com.yunchen.springbootmall_2.dto.ProductRequest;
import com.yunchen.springbootmall_2.model.Product;

public interface ProductService {
    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);
}

