package com.springdemo.foodordering.dto;

import com.springdemo.foodordering.entity.Dish;
import com.springdemo.foodordering.entity.Review;
import jakarta.persistence.OneToMany;

import java.util.List;

public class RestaurantDto {
    private Long restId;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Dish> menu;
    private List<Review> reviews;
}
