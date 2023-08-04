package com.aymen.art;

public class Sculpture extends Art {
    // Additional member variable
    private String material;

    // Constructor
    public Sculpture(String title, String author, String description, String material) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.material = material;
    }

    // Implementation of the abstract method
    @Override
    public void viewArt() {
        System.out.println("Sculpture Title: " + title);
        System.out.println("Sculpture Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Material: " + material);
    }
}
