package com.example.componentvsconfiguration.controller;

import com.example.componentvsconfiguration.entity.Product;
import com.example.componentvsconfiguration.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private Product product;

    @GetMapping("/products")
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/productConfig")
   public String getProductConfig(){
        System.out.println(product);
        return "product config is working fine";
    }
}
