package com.example.actividad.domain.service;

import com.example.actividad.domain.models.Category;

import java.util.List;

public interface CategoryService {
    Category save(Category category);

    List<Category> getAll();
}
