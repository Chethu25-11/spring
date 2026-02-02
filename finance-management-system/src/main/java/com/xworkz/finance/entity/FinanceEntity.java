package com.xworkz.finance.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "finance_info")
@NamedQuery(name = "findAllFinanceEntity",query = "select f from FinanceEntity f ")
public class FinanceEntity {

@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
@Column(name = "id")
    private  int id;
@Column(name = "customer_name")
    private  String customerName;
@Column(name = "loan_type")
    private String loanType;
@Column(name = "amount")
    private double amount;
}
