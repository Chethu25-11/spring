package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookProduct {
    @Autowired
public BookProduct BookProduct;

public void write(){
    System.out.println("BookProduct is using for  write ");
}
public void read(){
    System.out.println("BookProduct is using for read");

}
public void getAuthor(){
    System.out.println("BookProduct is using for Author");
}
}
