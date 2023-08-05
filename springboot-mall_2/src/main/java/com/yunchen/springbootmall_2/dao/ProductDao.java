package com.yunchen.springbootmall_2.dao;

import com.yunchen.springbootmall_2.model.Product;

public interface ProductDao {
   Product getProductById(Integer productId);
}
