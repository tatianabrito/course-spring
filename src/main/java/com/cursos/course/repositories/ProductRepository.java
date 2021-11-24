package com.cursos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
