package com.example.actividad.models;

import java.util.List;

public class Product {
    private String id;
    private String name;
    private float price;
    private List<Category> categoryList;

    public Product() {
    }

    public Product(String id, String name, float price, List<Category> categoryList) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryList = categoryList;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
