package com.oxd.course.service;

import com.oxd.course.entities.Product;
import com.oxd.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> Product = productRepository.findById(id);
        return Product.orElseThrow();
    }

}
