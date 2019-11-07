package com.offcn.springcloud.mapper;

import com.offcn.springcloud.entities.Product;

import java.util.List;

public interface ProductMapper {
    Product findById(Long id);
    List<Product> findAll();
    boolean addproduct(Product product);
}
