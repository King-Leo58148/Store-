package com.codewithlouis.store.service;

import com.codewithlouis.store.model.Product;
import com.codewithlouis.store.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Getter
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);

    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}