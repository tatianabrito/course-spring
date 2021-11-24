package com.cursos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
