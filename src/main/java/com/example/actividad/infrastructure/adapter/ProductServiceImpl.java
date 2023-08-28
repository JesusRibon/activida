package com.example.actividad.infrastructure.adapter;

import com.example.actividad.domain.models.Category;
import com.example.actividad.domain.models.Product;
import com.example.actividad.domain.service.ProductService;
import com.example.actividad.infrastructure.adapter.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private CategoryServiceImpl categoryService;
    private List<Product> products = new ArrayList<>();
    @Override
    public Product save(Product product) {
        List<Category> categoryList = categoryService.getAll();
        product.setCategoryList(categoryList);
        products.add(product);
        return product;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
