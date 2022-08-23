package com.oxd.course.service;

import com.oxd.course.entities.Category;
import com.oxd.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> Category = categoryRepository.findById(id);
        return Category.orElseThrow();
    }

}
