package com.byteworks.foodvendor.controllers;


import com.byteworks.foodvendor.models.Meal;
import com.byteworks.foodvendor.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/foods")
public class MealController {

    private MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping
    public List<Meal> getAvailableMeals(){
        return mealService.getAvailableMeals();
    }

    @GetMapping("/{mealName}")
    public Meal getMealByName(@PathVariable  String mealName){
        return  mealService.getMealByName(mealName);
    }
}
