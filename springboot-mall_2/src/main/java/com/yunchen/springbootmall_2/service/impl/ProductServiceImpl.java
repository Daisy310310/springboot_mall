package com.yunchen.springbootmall_2.service.impl;

import com.yunchen.springbootmall_2.constant.ProductCategory;
import com.yunchen.springbootmall_2.dao.ProductDao;
import com.yunchen.springbootmall_2.dao.ProductQueryParams;
import com.yunchen.springbootmall_2.dto.ProductRequest;
import com.yunchen.springbootmall_2.model.Product;
import com.yunchen.springbootmall_2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.PropertyResourceBundle;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}

