package com.oxd.course.repositories;

import com.oxd.course.entities.Category;
import com.oxd.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
