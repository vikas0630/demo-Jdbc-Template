package com.example.demo.Jdbc.Template.dao;

import com.example.demo.Jdbc.Template.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    private static final String insert = "insert into product(pid,pname,cost) values(?,?,?)";
    private static final String update = "update product set pname=? where pid=?";
    private static final String getdata = "select * from product where pid=?";
    private static final String delete = "delete from product where pid=?";
    private static final String allproducts = "select * from product";


    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Product insertProduct(Product product) {
        jdbcTemplate.update(insert, product.getPid(), product.getPname(), product.getCost());
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        jdbcTemplate.update(update,product.getPname(),product.getPid());
        return product;
    }

    @Override
    public String deleteProduct(int pid) {
        jdbcTemplate.update(delete,pid);
        return "deleted product with id :"+pid;
    }

    @Override
    public Product getProduct(int pid) {
        return jdbcTemplate.queryForObject(getdata,(rs,rowNum)->{
            return new Product(rs.getInt("pid"),rs.getString("pname"),rs.getInt(pid));
        },pid);

    }

    @Override
    public List<Product> getAllProducts() {
        return jdbcTemplate.query(allproducts, (rs, rowNum) -> {
            return new Product(rs.getInt("pid"), rs.getString("pname"), rs.getInt("cost"));
        });
    }

}

