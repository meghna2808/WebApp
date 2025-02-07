package com.example.webApp;

import lombok.AllArgsConstructor;
import lombok.Data;
// Product :this represent data(model) layer of MVC
@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String productName;
    private int price;
}
