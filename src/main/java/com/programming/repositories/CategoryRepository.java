package com.programming.repositories;

import com.programming.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);

}
