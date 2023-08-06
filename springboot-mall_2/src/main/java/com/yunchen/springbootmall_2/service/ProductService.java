package com.yunchen.springbootmall_2.service;

import com.yunchen.springbootmall_2.constant.ProductCategory;
import com.yunchen.springbootmall_2.dao.ProductQueryParams;
import com.yunchen.springbootmall_2.dto.ProductRequest;
import com.yunchen.springbootmall_2.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

