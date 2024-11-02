package com.simple.web.service;

import com.simple.web.model.Product;
import com.simple.web.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//
//    List<Product> products = new ArrayList<>( Arrays.asList(new Product(101,"mi",10000),
//            new Product(102,"Nokia",12000),
//            new Product(103,"Samsing",13000)));
//
    public List<Product> getProducts(){
        return repo.findAll() ;
    }

    public Product getProductsById(int prodId){
        return repo.findById(prodId).orElse(new Product());
    }


    public Product addProduct(Product prod) {
        return repo.save(prod);
    }

    public Product updateRecord(Product prod) {
        return repo.save(prod);
    }


    public void deletedata(int prodId) {
       repo.deleteById(prodId);;

    }
}
