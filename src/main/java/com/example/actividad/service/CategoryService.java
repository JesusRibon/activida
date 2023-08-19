package com.example.actividad.service;

import com.example.actividad.models.Category;

import java.util.List;

public interface CategoryService {
    Category save(Category category);

    List<Category> getAll();
}
