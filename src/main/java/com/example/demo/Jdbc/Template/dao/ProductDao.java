package com.example.demo.Jdbc.Template.dao;

import com.example.demo.Jdbc.Template.model.Product;

import java.util.List;

public interface ProductDao {
    Product insertProduct(Product product);
    Product updateProduct(Product product);
    String deleteProduct(int pid);
    Product getProduct(int pid);
    List<Product> getAllProducts();
}
