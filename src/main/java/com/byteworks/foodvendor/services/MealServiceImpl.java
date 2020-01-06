package com.byteworks.foodvendor.services;

import com.byteworks.foodvendor.error_handling.MealNotFoundException;
import com.byteworks.foodvendor.models.Meal;
import com.byteworks.foodvendor.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.util.List;


@Service
public class MealServiceImpl implements MealService {



    private MealRepository mealRepository;

    @Autowired
    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public Meal getMealByName(String name) throws MealNotFoundException {
        return mealRepository.findByName(name).orElseThrow(()-> new  MealNotFoundException(name));
    }

    @Override
    public List<Meal> getAvailableMeals() {
        return mealRepository.findAll();
    }

    @Override
    public void deleteAll() {
        mealRepository.deleteAll();
    }

    @Override
    public void saveAll(Iterable<Meal> meals) {
        mealRepository.saveAll(meals);
    }
}
