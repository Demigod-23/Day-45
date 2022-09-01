package com.ank.joint;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Entity(name = "Account")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class sc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String owner;

    private double balance;

    private double interestRate;