package com.dinner.recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class RecipesApplication extends SpringBootServletInitializer
public class RecipesApplication
{

	public static void main(String[] args) {
		SpringApplication.run(RecipesApplication.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(RecipesApplication.class);
//	}
}

