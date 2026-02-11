package com.xworkz.home.buildings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Apartment")
public class Apartment implements Home{

    public Apartment(){
        System.out.println("Apartment have people lived");

    }
    public void stay(){
        System.out.println("staying Apartment");
    }


    @Override
    public void data() {
        System.out.println("Apartment :100000 for family");
    }
}
