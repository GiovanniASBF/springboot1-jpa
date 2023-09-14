package com.kspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kspringboot.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
