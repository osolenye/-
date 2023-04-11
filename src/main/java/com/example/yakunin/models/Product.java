package com.example.yakunin.models;

import jakarta.persistence.*;
import lombok.*;

//аннотация от ломбок для автоматических сеттеров, геттеров, конструкторов(урок2)@Data
//
@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    Long id;
    @Column(name="title")
    private String title;
    @Column(name="description", columnDefinition = "text")
    private String description;
    @Column(name="city")
    private String city;
    @Column(name="author")
    private String author;
    @Column(name="price")
    private int price;

}
