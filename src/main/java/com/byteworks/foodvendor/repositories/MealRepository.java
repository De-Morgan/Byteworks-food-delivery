package com.byteworks.foodvendor.repositories;

import com.byteworks.foodvendor.models.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MealRepository extends MongoRepository<Meal,String> {
    Optional<Meal> findByName(String name);

}
