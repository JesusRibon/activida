package com.example.actividad.infrastructure.adapter;

import com.example.actividad.domain.models.Category;
import com.example.actividad.domain.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {
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
