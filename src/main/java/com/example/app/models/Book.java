package com.example.app.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private double price;
}
