package com.byteworks.foodvendor.models;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Document(collection = "meals")
public class Meal {

    @Id
    private String id;


    @Indexed(unique = true)
    @NotBlank(message = "Meal name is mandatory")
    private String name;

    @NotNull
    @Min(value = 0L, message = "The price must be positive")
    private double price;

    ///description for the meal
    private String description;

    private Meal(){

    }

    public Meal(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Double.compare(meal.getPrice(), getPrice()) == 0 &&
                id.equals(meal.id) &&
                getName().equals(meal.getName()) &&
                Objects.equals(getDescription(), meal.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getPrice(), getDescription());
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
