package com.codewithlouis.store.controller;

import com.codewithlouis.store.model.Product;
import com.codewithlouis.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
@GetMapping("/products")
    public List<Product> getProducts(){
     return service.getProducts();
    }
@GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id){
    return service.getProductById(id);
}
@PostMapping("/products")
public void addProduct(@RequestBody Product product){
    service.addProduct(product);

    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {

        service.updateProduct(prod);
}

@DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
    System.out.println("working");
    service.deleteProduct(id);
}
}