package com.xworkz.fan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FanController {
    @RequestMapping("/start")
    public String start(){
        System.out.println("running start method in FanController ");
        return  "";

    }
    @RequestMapping("/stop")
    public String stop(){
        System.out.println("running stop method in FanController");
        return "";

    }
    @RequestMapping("/repair")
    public String repair(){
        System.out.println("running repair method in FanController");
        return "";
    }
}
