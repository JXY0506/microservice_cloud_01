package com.offcn.springcloud.controller;


import com.offcn.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController_Customer {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping(value = "/customer/product/add")
    public boolean add(Product product){
        return restTemplate.postForObject(REST_URL_PREFIX+"/product/add",product,Boolean.class);
    }

    @RequestMapping(value = "/customer/product/get/{id}")
    public Product get(@PathVariable("id") Long id){
        return restTemplate.getForObject(URI.create(REST_URL_PREFIX+"/product/get/"+id),Product.class);
    }

    @RequestMapping(value = "/customer/product/get/list")
    public List<Product> list(){
        return restTemplate.getForObject(URI.create(REST_URL_PREFIX+"/product/get/list"),List.class);
    }
}
