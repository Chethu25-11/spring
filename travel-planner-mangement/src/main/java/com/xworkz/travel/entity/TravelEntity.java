package com.xworkz.travel.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
@Table(name = "tour_info")
@NamedQuery(name = "findNameAndKm",query = "select x from TravelEntity x where " +"x.name = :name And x.km = :km ")
public class TravelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "km")
    private double km;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
}
