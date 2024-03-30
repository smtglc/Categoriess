package com.IMAGE.demoimage.controller;

import com.IMAGE.demoimage.Entity.Categories;
import com.IMAGE.demoimage.Entity.Category;
import com.IMAGE.demoimage.repository.CategoriesRepository;
import com.IMAGE.demoimage.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoriesRepository categoriesRepository;


    @GetMapping
    public List<Categories> getAllDoctors() {
        return categoriesRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Categories> createDoctor(@RequestBody Categories categories) {
        Categories _categories;
        _categories = categoriesRepository.save(categories);

        return new ResponseEntity<>(_categories, HttpStatus.CREATED);
    }








}