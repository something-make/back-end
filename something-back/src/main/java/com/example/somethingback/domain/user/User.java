package com.example.somethingback.domain.user;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    @Embedded
    private Email email;

    private String imageUrl;
    private String token;

    public UUID getUuid() {
        return uuid;
    }

    public Email getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getToken() {
        return token;
    }
}
