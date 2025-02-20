package com.example.webApp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Product :this represent data(model) layer of MVC
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Product {
    @Id
    private int prodId;
    private String productName;
    private int price;
}
