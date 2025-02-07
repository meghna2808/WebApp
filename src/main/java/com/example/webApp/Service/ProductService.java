package com.example.webApp.Service;

import com.example.webApp.Product;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
@Data
public class ProductService {
    List<Product>productList= Arrays.asList(new Product(1001,"iphone",100000),new Product(1002,"laptop",150000));
    public List<Product> getProducts()
    {
        return  productList;
    }

    public Product getProductById(int prodId) {
        return productList.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Product(100,"No item",15000));
    }
}
