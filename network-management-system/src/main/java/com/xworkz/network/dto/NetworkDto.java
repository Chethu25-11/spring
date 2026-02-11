package com.xworkz.network.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "network_info")
public class NetworkDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String networkTypeName;
    private String email;
    private String status;
    private String password;
}
