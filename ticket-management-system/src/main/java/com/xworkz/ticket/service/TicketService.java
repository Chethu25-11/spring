package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.entity.TicketEntity;
import com.xworkz.ticket.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketRepo repo;
    public TicketEntity validateAndSave(TicketDto dto) {
        System.out.println("inside validateAndSave in TicketService ");
        TicketEntity entity = new TicketEntity();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setPsw(dto.getPassword());
       repo.saveTicketInfo(entity);
        return entity;
    }
}
