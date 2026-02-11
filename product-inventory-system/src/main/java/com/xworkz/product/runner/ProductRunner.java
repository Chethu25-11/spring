package com.xworkz.product.runner;

import com.xworkz.product.configuration.ProductConfiguration;
import com.xworkz.product.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.applet.AppletContext;
import java.awt.*;


public class ProductRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        ElectronicsProduct product = context.getBean(ElectronicsProduct.class);
        product.powerOff();
        product.buy();
        product.powerOn();
        System.out.println("____________________________________");
        BookProduct product1 = context.getBean(BookProduct.class);
        product1.read();
        product1.write();
        product1.getAuthor();
        System.out.println("____________________________________");
        ClothingProduct product2 = context.getBean(ClothingProduct.class);
        product2.wear();
        product2.color();
        product2.wash();
        System.out.println("_______________________________________");
        FurnitureProduct product3 = context.getBean(FurnitureProduct.class);
        product3.clean();
        product3.use();
        product3.material();
        System.out.println("------------------------------------");
        CosmeticProduct product4 = context.getBean(CosmeticProduct.class);
        product4.apply();
        product4.checkSkinType();
        product4.remove();
        System.out.println("--------------------------------------");
        GroceryProduct product5 = context.getBean(GroceryProduct.class);
        product5.brand();
        product5.store();
        product5.weight();
        System.out.println("----------------------------------------");
        LaptopProduct product6 = context.getBean(LaptopProduct.class);
        product6.browse();
        product6.shutdown();
        product6.code();
        System.out.println("----------------------------------------");
        MobileProduct product7 = context.getBean(MobileProduct.class);
        product7.call();
        product7.charge();
        product7.message();
        System.out.println("------------------------------------------");
        SportsProduct product8 = context.getBean(SportsProduct.class);
        product8.play();
        product8.type();
        product8.maintain();
        System.out.println("__________________________________");
        ToyProduct product9 = context.getBean(ToyProduct.class);
        product9.getAgeGroup();
        product9.buy();
        product9.brand();
    }
}
