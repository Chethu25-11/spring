package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportsProduct {
    @Autowired
public SportsProduct SportsProduct;

public void play(){
    System.out.println("playing the sports");
}
public void maintain(){
    System.out.println("maintain the sports players");
}
public void type(){
    System.out.println("type:outdoors");
}
}
