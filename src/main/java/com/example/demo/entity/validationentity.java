package com.example.demo.entity;
import jakarta.persistence.Entity;

@Entity
public class validationentity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    NotNull
    private String username;
    private String email;
    private Integer age;
}