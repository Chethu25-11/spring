package com.xworkz.wifi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WifiController {
    @RequestMapping("/hotspot")
    public String hotspot(){
        System.out.println("running on hotspot in WifiController ");
        return "";
    }
    @RequestMapping("/connect")
    public String connect(){
        System.out.println("running on connect in WifiController");
        return "";
    }
    @RequestMapping("/disconnect")
    public String disconnect(){
        System.out.println("running on disconnect in WifiController");
        return "";
    }
}
