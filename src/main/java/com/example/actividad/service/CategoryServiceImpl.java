package com.example.actividad.service;

import com.example.actividad.models.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService{
    private List<Category> categoryList = new ArrayList<>();

    @Override
    public Category save(Category category) {
        categoryList.add(category);
        return category;
    }

    @Override
    public List<Category> getAll() {
        return categoryList;
    }
}
