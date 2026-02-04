package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopProduct {
    @Autowired
    public LaptopProduct LaptopProduct;

    public void code(){
        System.out.println("coding on laptop");
    }
    public void shutdown(){
        System.out.println("shutdown the laptop  ");
    }
    public void browse(){
        System.out.println("browsing the laptop");
    }


}
