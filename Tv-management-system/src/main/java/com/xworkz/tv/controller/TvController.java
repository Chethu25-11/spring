package com.xworkz.tv.controller;

import com.xworkz.tv.dto.TvDto;
import com.xworkz.tv.service.TvService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TvController {
    private  final TvService service;

    public TvController(TvService service) {
        this.service = service;
        System.out.println("running constructor in TvController");
    }

    @RequestMapping("/turnOn")
    public String turnOn(){
        System.out.println("running on turnOn method in TvController ");
        return "userRegistration.jsp";

    }
    @RequestMapping("/anything")
    public String register(@RequestParam("tvName") String tvName, @RequestParam("email") String email, @RequestParam("address") String address, @RequestParam("password") String password, @RequestParam("price") double price){
        System.out.println("running register in ticketController");
        System.out.println("tvName:"+tvName);
        System.out.println("email:"+email);
        System.out.println("address:"+address);
        System.out.println("password:"+password);
        System.out.println("price:"+price);
        TvDto dto=new TvDto();
        //  dto.setId(id);
        dto.setTvName(tvName);
        dto.setEmail(email);
        dto.setPassword(password);
        dto.setAddress(address);
        dto.setPrice(price);
        service.validateAndSave(dto);
        return "index.jsp";
    }
    @RequestMapping("/turnOff")
    public String turnOff(){
        System.out.println("running on turnOff method in TvController");
        return "";
    }
    @RequestMapping("/watch")
    public String watch(){
        System.out.println("running on watch method in TvController");
        return "";
    }
}
