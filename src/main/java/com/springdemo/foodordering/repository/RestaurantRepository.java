package com.springdemo.foodordering.repository;

import com.springdemo.foodordering.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
