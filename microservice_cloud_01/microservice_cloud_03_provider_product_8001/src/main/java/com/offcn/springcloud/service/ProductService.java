package com.offcn.springcloud.service;

import com.offcn.springcloud.entities.Product;

import java.util.List;

public interface ProductService {
    Product findById(Long id);
    List<Product> findAll();
    boolean addproduct(Product product);

}
