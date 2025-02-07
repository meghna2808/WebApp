package com.example.webApp.Controller;

import com.example.webApp.Product;
import com.example.webApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/products")
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }
    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return productService.getProductById(prodId);
    }
}
