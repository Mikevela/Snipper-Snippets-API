package com.example.SnippersnippetsAPI.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Snippet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    // constructor, getters, and setters

    // constructors
    public Snippet() {
        // default constructor
    }

    public Snippet(String content) {
        this.content = content;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //toString method (optional for better logging and debugging)

    @Override
    public String toString() {
        return "Snippet{" +
                "id=" + id +
                ", content=' " + content + '\'' +
                '}';
    }
}
