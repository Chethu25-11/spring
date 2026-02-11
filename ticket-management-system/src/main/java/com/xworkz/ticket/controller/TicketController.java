package com.xworkz.ticket.controller;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.service.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicketController {
    private final TicketService ticketService;

    private TicketController(TicketService ticketService) {
        this.ticketService = ticketService; //
        System.out.println("running constructor in TicketController");
    }
    @RequestMapping("/user")
    public  String user(){
        System.out.println("running on ticket in ticketController");
        return "userRegistration.jsp";
    }
    @RequestMapping("/anything")
    public String register(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("phoneNumber") long phoneNumber,@RequestParam("psw") String psw){
        System.out.println("running register in ticketController");
        System.out.println("name:"+name);
        System.out.println("email:"+email);
        System.out.println("phoneNumber:"+phoneNumber);
        System.out.println("psw:"+psw);
        TicketDto dto=new TicketDto();
      //  dto.setId(id);
        dto.setName(name);
        dto.setEmail(email);
        dto.setPhoneNumber(phoneNumber);
        dto.setPassword(psw);
        ticketService.validateAndSave(dto);
        return "index.jsp";
    }

    @RequestMapping("/ListOfUser")
    public  String ListOfUser(){
        System.out.println("running on ListOfUser in ticketController");
        return "";
    }

}
