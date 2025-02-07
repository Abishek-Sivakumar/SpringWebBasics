package com.abishek.MySpringWeb.controller;

import com.abishek.MySpringWeb.model.Products;
import com.abishek.MySpringWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Products getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products product){
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Products prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

}
