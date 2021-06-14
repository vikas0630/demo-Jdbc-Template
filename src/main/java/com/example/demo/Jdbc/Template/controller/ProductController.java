package com.example.demo.Jdbc.Template.controller;

import com.example.demo.Jdbc.Template.dao.ProductDao;
import com.example.demo.Jdbc.Template.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductDao productDao;

    @PostMapping(path = "/product")
    public Product addProduct( @RequestBody  Product product) {
        return productDao.insertProduct(product);
    }

    @PutMapping(path = "/product")
    public Product updateProduct(@RequestBody Product product) {
        return productDao.updateProduct(product);
    }

    @GetMapping(path = "/product/{pid}")
    public Product getProduct(@PathVariable("pid") int pid) {
        return productDao.getProduct(pid);
    }

    @GetMapping(path = "/products")
    public List<Product> getProducts() {
        return productDao.getAllProducts();
    }

    @DeleteMapping(path="product/{pid}")
    public String deleteById(@PathVariable("pid") int pid ){
        return productDao.deleteProduct(pid);
    }


}
