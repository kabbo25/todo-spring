package com.example.todo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TODO")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    // Add other fields as needed

    // Constructors
    public ToDo() {
    }

    public ToDo(String title, String description) {
        this.title = title;
        this.description = description;
        // Initialize other fields as needed
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
