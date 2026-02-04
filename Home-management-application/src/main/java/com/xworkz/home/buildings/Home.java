package com.xworkz.home.buildings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {
    public Home(){
        System.out.println( "name of the house");
    }
    @Autowired
    Home home;
    public void rent(){
        System.out.println("rent for the home");
        System.out.println(home);

    }


}
