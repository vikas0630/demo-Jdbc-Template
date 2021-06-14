package com.example.demo.Jdbc.Template.model;

import com.example.demo.Jdbc.Template.validation.ProductType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ProductType(type = "chocolates",quantity = 1)
public class Product {
    private int pid;
    private String pname;
    private int cost;


}
