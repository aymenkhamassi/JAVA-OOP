package com.aymen.art;

public class Painting extends Art {
    // Additional member variable
    private String paintType;

    // Constructor
    public Painting(String title, String author, String description, String paintType) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.paintType = paintType;
    }

    // Implementation of the abstract method
    @Override
    public void viewArt() {
        System.out.println("Painting Title: " + title);
        System.out.println("Painting Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Paint Type: " + paintType);
    }
}
