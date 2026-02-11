package com.xworkz.home.buildings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Buildings {
    @Autowired
//    @Qualifier ("Apartment")
    @Qualifier("PgRooms")
    Home home;
    public void getDetails(){
        System.out.println("welcome to home application");
        home.data();
    }


}
