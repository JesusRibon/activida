package com.example.actividad.controller;
import com.example.actividad.models.Category;
import com.example.actividad.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping
    public ResponseEntity<Category> save(@RequestBody  Category category){
        categoryService.save(category);
        return new ResponseEntity<>(category , HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAll(){
        return new ResponseEntity<>(categoryService.getAll() , HttpStatus.OK);
    }
}
