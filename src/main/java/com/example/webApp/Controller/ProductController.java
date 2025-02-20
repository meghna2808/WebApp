package com.example.webApp.Controller;

import com.example.webApp.Product;
import com.example.webApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return productService.getProductById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product)
    {
        productService.add(product);
    }
    @DeleteMapping("/products/{prodId}")
    public void  deleteProduct(@PathVariable int prodId)
    {
        productService.delete(prodId);
    }
}
