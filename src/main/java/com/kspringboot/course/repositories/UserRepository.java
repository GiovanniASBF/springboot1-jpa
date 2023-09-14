package com.kspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kspringboot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
