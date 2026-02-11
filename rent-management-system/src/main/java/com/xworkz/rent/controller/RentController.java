package com.xworkz.rent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RentController {
    @RequestMapping("/getPayment")
public String getPayment(){
    System.out.println("running getPayment in RentController ");
    return "";

}
@RequestMapping("/floor")
public String floor(){
    System.out.println("running floor method in RentController");
    return "";

}
@RequestMapping("/rooms")
public String rooms(){
    System.out.println("running rooms method in RentController");
    return "";
}
}
