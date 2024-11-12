package com.springdemo.foodordering.repository;

import com.springdemo.foodordering.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
