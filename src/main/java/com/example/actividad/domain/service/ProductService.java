package com.example.actividad.domain.service;

import com.example.actividad.domain.models.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> getAll();
}
