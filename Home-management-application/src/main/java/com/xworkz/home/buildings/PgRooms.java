package com.xworkz.home.buildings;

import org.springframework.stereotype.Component;

@Component("PgRooms")
public class PgRooms implements Home{
    public PgRooms(){
        System.out.println("pg rooms");
    }
    public void live(){
        System.out.println("Students live in PGs");
    }

    @Override
    public void data() {
        System.out.println("PgRooms:boy rent:100");
    }
}
