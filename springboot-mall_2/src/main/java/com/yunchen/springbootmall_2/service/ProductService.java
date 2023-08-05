package com.yunchen.springbootmall_2.service;

import com.yunchen.springbootmall_2.dto.ProductRequest;
import com.yunchen.springbootmall_2.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

