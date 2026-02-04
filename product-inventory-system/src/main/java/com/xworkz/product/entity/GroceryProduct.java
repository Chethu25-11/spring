package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroceryProduct {
public GroceryProduct GroceryProduct;
@Autowired
public void weight(){
    System.out.println("weight:10kg");
}
public  void brand(){
    System.out.println("brand:abc GroceryProduct ");

}
public void store(){
    System.out.println("storing the proper place ");
}
}
