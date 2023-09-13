package com.example.componentvsconfiguration.config;

import com.example.componentvsconfiguration.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public Product getProduct() {
        return new Product(3,"Tablet",40000,1);
    }
}
