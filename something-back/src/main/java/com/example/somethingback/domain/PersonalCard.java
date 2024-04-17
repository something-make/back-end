package com.example.somethingback.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PersonalCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;





}
