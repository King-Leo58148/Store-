package com.codewithlouis.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int price;


}
