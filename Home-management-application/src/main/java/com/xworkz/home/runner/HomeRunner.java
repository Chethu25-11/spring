package com.xworkz.home.runner;

import com.xworkz.home.buildings.Home;
import com.xworkz.home.configuration.HomeConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HomeRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HomeConfiguration.class);
       Home container= context.getBean(Home.class);
       container.rent();
        Home container1= context.getBean(Home.class);
        container1.rent();
    }
}
