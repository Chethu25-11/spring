package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FurnitureProduct {
    @Autowired
    public FurnitureProduct FurnitureProduct;

    public void use(){
        System.out.println("using the furniture");

    }
    public void material(){
        System.out.println("material:wood");

    }
    public void clean(){
        System.out.println("cleaning the furniture");
    }

}
