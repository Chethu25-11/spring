package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClothingProduct {
    @Autowired
    public ClothingProduct ClothingProduct;

    public void wash(){
        System.out.println("washing the clothing item");
    }
    public void wear(){
        System.out.println("wearing the clothing item");

    }
    public void color(){
        System.out.println("color:blue");
    }
}
