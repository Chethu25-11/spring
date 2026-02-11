package com.xworkz.ticket.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Setter
@ToString
@Table(name = "ticket_info")

public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private long phoneNumber;
    private String psw;
}
