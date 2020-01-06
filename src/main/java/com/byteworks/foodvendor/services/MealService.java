package com.byteworks.foodvendor.services;

import com.byteworks.foodvendor.models.Meal;

import java.util.List;

public interface MealService {

    Meal getMealByName(String name);

    List<Meal> getAvailableMeals();

    void deleteAll();

    void saveAll(Iterable<Meal> meals);

}
