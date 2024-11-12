package com.springdemo.foodordering.dto;

import com.springdemo.foodordering.entity.Dish;
import com.springdemo.foodordering.entity.OrderStatus;
import com.springdemo.foodordering.entity.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDto {
    private Long orderId;
    private User user;
    private List<Dish> dishes;
    private OrderStatus status;
    private LocalDateTime orderTime;
}
