package com.springdemo.foodordering.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "restaurant")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restId;

    private String name;
    private String address;
    private String phoneNumber;

    @OneToMany(mappedBy = "restaurant")
    private List<Dish> menu;

    @OneToMany(mappedBy = "restaurants")
    private List<Review> reviews;
}
