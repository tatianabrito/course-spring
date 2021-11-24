package com.cursos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
