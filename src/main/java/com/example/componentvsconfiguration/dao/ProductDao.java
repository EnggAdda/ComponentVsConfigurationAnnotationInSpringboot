package com.example.componentvsconfiguration.dao;

import com.example.componentvsconfiguration.entity.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDao {

    private static final List<Product> productsList = new ArrayList<>();

     public List<Product> getProductsList() {
         return this.productsList;
     }
@PostConstruct
private void init(){
    Product p1  = new Product(1,"Mobile",30000,1);
    Product p2 = new Product(2,"laptop",66000,1);
   this.productsList.add(p1);
   this.productsList.add(p2);
}
}
