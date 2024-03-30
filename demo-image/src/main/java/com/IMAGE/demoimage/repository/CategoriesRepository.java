package com.IMAGE.demoimage.repository;

import com.IMAGE.demoimage.Entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories,String> {
}
