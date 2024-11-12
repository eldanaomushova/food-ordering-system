package com.springdemo.foodordering.dto;

import com.springdemo.foodordering.entity.Restaurant;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

public class DishDto {
    private Long dishId;
    private String name;
    private String description;
    private Double price;
    private List<String> ingredients;
    private String dietaryInfo;
    private Restaurant restaurant;
}
