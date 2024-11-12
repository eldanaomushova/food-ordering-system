package com.springdemo.foodordering.repository;

import com.springdemo.foodordering.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}

