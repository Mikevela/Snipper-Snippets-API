package com.example.SnippersnippetsAPI.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Snippet {

    @Id
    @GeneratedValue(strategy = GenrationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;
}
