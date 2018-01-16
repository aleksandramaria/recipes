package com.dinner.recipes.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by ola on 07/01/2018.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "recipes")
public class DinnerIdea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}