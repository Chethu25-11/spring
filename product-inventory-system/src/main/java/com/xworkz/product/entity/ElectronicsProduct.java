package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ElectronicsProduct {
    @Autowired
    public ElectronicsProduct ElectronicsProduct;

    public void buy(){
        System.out.println(" ready to buy ElectronicsProduct ");
    }

    public void powerOn(){
        System.out.println("ElectronicsProduct is on ");
    }

     public void powerOff(){
         System.out.println("ElectronicsProduct is off");
     }
    }


