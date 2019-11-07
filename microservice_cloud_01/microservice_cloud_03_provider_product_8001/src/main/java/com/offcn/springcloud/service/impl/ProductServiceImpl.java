package com.offcn.springcloud.service.impl;

import com.offcn.springcloud.entities.Product;
import com.offcn.springcloud.mapper.ProductMapper;
import com.offcn.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product findById(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public boolean addproduct(Product product) {
        return productMapper.addproduct(product);
    }
}
