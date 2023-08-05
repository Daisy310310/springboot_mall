package com.yunchen.springbootmall_2.service.impl;

import com.yunchen.springbootmall_2.dao.ProductDao;
import com.yunchen.springbootmall_2.model.Product;
import com.yunchen.springbootmall_2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}

