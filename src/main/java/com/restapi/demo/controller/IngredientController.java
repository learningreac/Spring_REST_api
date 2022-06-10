package com.restapi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.demo.model.Ingredient;
import com.restapi.demo.reository.IngredientRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    // get all

    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients() {
        Iterable<Ingredient> iterable = ingredientRepository.findAll();
        List<Ingredient> list = Streamable.of(iterable).toList();
        return list;
    }
}
