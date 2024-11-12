package com.springdemo.foodordering.dto;

import com.springdemo.foodordering.entity.Order;
import com.springdemo.foodordering.entity.Role;

import java.util.List;

public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String genre;
    private Role role;
    private List<Order> orders;
}
