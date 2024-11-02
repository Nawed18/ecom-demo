package com.simple.web.controller;

import com.simple.web.model.Product;
import com.simple.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/product")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductsById(prodId);
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product prod){
        return service.addProduct(prod);
    }

    @PutMapping("/update")
    public Product updateRecord(@RequestBody Product prod){
        return service.updateRecord(prod);
    }
    @DeleteMapping("/delete/{prodId}")
    public void deletedata(@PathVariable int prodId){
        service.deletedata(prodId);
    }
}
