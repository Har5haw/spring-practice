package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private Integer freePasses;
    @NonNull private String postalCode;
    @NonNull private String courseCode;
}
