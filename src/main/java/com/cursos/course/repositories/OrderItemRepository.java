package com.cursos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
