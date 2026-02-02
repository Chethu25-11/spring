package com.xworkz.banking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "bank_info")
@NamedQuery(name = "findAllBankEntity",query = "select o from BankEntity o")
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "account_number")
    private long accountNumber;
    @Column(name = "amount")
    private double amount;
}
