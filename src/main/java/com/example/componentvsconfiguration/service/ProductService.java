package com.example.componentvsconfiguration.service;

import com.example.componentvsconfiguration.dao.ProductDao;
import com.example.componentvsconfiguration.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    private ProductDao productDao;

   public List<Product> getAllProducts() {
    return productDao.getProductsList();
    }
}
