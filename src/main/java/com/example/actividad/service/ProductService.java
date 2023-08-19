package com.example.actividad.service;

import com.example.actividad.models.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> getAll();
}
