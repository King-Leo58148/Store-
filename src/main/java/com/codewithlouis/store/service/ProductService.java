package com.codewithlouis.store.service;

import com.codewithlouis.store.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products = Arrays.asList(new Product(101,"Iphone",
            5000),
            new Product(102,"Tablet",5000),
            new Product(103,"Tablet",5000));
   public List<Product> getProducts(){
       return products;
   }
}
