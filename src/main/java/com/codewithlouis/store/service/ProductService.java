package com.codewithlouis.store.service;

import com.codewithlouis.store.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Getter
@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone", 5000),
            new Product(102,"Tablet",5000),
            new Product(103,"Tablet",5000)));

    public Product getProductById(int id){
       return products.stream().filter(p ->p.getProdId() == id).findFirst().orElse(null);
   }

   public void addProduct(Product product)
   {
       products.add(product);
   }

   public void updateProduct(Product prod){
       int index = 0;
       for (int i=0 ;i<products.size();i++){
           if(products.get(i).getProdId()==prod.getProdId()){
               index = i;
           }
           products.set(index,prod);
       }

   }

   public void deleteProduct(int id){
       for (int i=0 ;i<products.size();i++){
           if(products.get(i).getProdId()==id){
               products.remove(i);
               break;
           }
       };
   }
}
