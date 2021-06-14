package com.example.demo.Jdbc.Template.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int pid;
    private String pname;
    private int cost;


}
