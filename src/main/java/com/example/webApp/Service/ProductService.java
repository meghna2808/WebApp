package com.example.webApp.Service;

import com.example.webApp.Product;
import com.example.webApp.repository.ProductRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
@Data
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    List<Product>productList= new ArrayList<>(Arrays.asList(new Product(1001,"iphone",100000),new Product(1002,"laptop",150000)));
    public List<Product> getProducts()
    {
        return  productRepo.findAll();
//        return productList;
    }

    public Product getProductById(int prodId) {
        return productRepo.findById(prodId).orElse(new Product(1,"phone",3672));
    }


    public void add(Product product) {
        productRepo.save(product);
    }
    public  void delete(int prodId)
    {
        productRepo.deleteById(prodId);
    }
}
