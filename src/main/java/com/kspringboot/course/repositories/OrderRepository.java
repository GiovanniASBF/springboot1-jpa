package com.kspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kspringboot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
