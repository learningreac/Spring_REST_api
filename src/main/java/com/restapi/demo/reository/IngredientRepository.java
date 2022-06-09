package com.restapi.demo.reository;

import org.springframework.data.repository.CrudRepository;

import com.restapi.demo.model.Ingredient;

public interface IngredientRepository 
        extends CrudRepository<Ingredient, String>{
    
}
