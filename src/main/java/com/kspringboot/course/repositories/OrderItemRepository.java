package com.kspringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kspringboot.course.entities.OrderItem;
import com.kspringboot.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
