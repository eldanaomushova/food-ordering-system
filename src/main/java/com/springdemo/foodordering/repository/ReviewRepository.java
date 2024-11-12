package com.springdemo.foodordering.repository;

import com.springdemo.foodordering.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
