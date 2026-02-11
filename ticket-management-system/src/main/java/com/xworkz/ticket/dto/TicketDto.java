package com.xworkz.ticket.dto;

import lombok.Data;

@Data
public class TicketDto {
    private int id;
    private String name;
    private String email;
    private long phoneNumber;
    private String password;
}
