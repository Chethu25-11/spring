package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobileProduct {
    @Autowired
    public MobileProduct MobileProduct;

    public void charge(){
        System.out.println("charging the mobile");
    }
    public void call(){
        System.out.println("calling on the mobile");
    }
    public void message(){
        System.out.println("messaging on the mobile");
    }
}
