package com.dinner.recipes.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by ola on 07/01/2018.
 */

@Getter
@AllArgsConstructor
public class DinnerIdeaDto {
    private Long id;
    private String name;
    private String description;
}
