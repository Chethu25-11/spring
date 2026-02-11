package com.xworkz.network.controller;

import com.xworkz.network.dto.NetworkDto;
import com.xworkz.network.entity.NetworkEntity;
import com.xworkz.network.service.NetworkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NetworkController {
    private final NetworkService service;

    public NetworkController(NetworkService service) {
        this.service = service;
        System.out.println("running the service in NetworkController");
    }

    @RequestMapping("/network")
    private String register(@RequestParam("networkTypeName" )String networkTypeName,@RequestParam("email") String email,
                            @RequestParam("status") String status,@RequestParam("password") String password ){
        System.out.println("running register method in NetworkController");
        System.out.println("networkTypeName:"+networkTypeName);
        System.out.println("email:"+email);
        System.out.println("status:"+status);
        System.out.println("password:"+password);

        NetworkDto dto=new NetworkDto();
        dto.setNetworkTypeName(networkTypeName);
        dto.setEmail(email);
        dto.setPassword(password);
        dto.setStatus(status);

      service.validateAndSave(dto);
        return "index.jsp";
    }

    @RequestMapping("/data")
    public String data(){
        System.out.println("running data method in NetworkController");
        return "userRegistration.jsp";

    }

    @RequestMapping("/loading")
    public String loading(){
        System.out.println("running loading method in NetworkController");
        return "";

    }
}
