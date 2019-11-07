package com.offcn.springcloud.controller;


import com.offcn.springcloud.entities.Product;
import com.offcn.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add",method =RequestMethod.POST)
    public boolean add(Product product){
        return productService.addproduct(product);
    }

    @RequestMapping(value = "/product/get/{pid}",method = RequestMethod.GET)
    public Product get(@PathVariable("pid") Long pid){
        return productService.findById(pid);
    }

    @RequestMapping(value = "/product/get/list",method = RequestMethod.GET)
    public List<Product> list(){
        return productService.findAll();
    }

}
