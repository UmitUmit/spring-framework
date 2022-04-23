package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
public class Customer extends BaseEntity{

    private String Username;
    private String name;
    private String surName;
    private String email;
    private String address;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Payment> paymentList;

    public Customer(String username, String name, String surName, String email, String address) {
        Username = username;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
    }
}