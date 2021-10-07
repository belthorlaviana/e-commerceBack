package com.example.demo.dao;

public class Producto {

    private String id;
    private String name;
    private String caption;
    private String category;


    public Producto(String id, String name, String caption, String category) {
        this.id = id;
        this.name = name;
        this.caption = caption;
        this.category = category;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
