package com.byteworks.foodvendor.error_handling;

public class MealNotFoundException extends RuntimeException {

    public MealNotFoundException() {
    }

    public MealNotFoundException(String mealName) {
        super(mealName + " can not be found");
    }
}
