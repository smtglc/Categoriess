package com.IMAGE.demoimage.repository;

import com.IMAGE.demoimage.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
