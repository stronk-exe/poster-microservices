package com.poster.poster.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    private String content;

    public PostEntity() {
        // Ensure you have a default constructor
    }

    public PostEntity(Long id, String content) {
        // Ensure you have a default constructor
        this.id = id;
        this.content = content;
    }

    // Getters and setters for id and content

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
}
