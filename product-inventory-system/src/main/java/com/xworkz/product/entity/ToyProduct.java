package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToyProduct {
    @Autowired
    public ToyProduct ToyProduct;
//    @Autowired
    public void brand(){
        System.out.println("brand:fun type");
    }
    public void getAgeGroup(){
        System.out.println("getAgeGroup:10");
    }
    public void buy(){
        System.out.println("buying for the toy product");
    }
}
