package com.xworkz.laptop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Entity
@ToString
@Setter
@Table(name = "laptop_info")
@NamedQuery(name = "findAllLaptopEntity" ,query = "select o from LaptopEntity o" )
public class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
}
