package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String lastName;
    private Integer freePasses;
    private String postalCode;
    private String courseCode;

    public CustomerEntity(){

    }

    public CustomerEntity(String firstName, String lastName, Integer freePasses, String postalCode, String courseCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.freePasses = freePasses;
        this.postalCode = postalCode;
        this.courseCode = courseCode;
    }
}
