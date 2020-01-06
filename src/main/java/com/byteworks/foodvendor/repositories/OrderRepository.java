package com.byteworks.foodvendor.repositories;

import com.byteworks.foodvendor.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,String> {

    List<Order>  findByDeveloperUsername(String username);


    @Query(value = "{'requestedFoodNames' : ?0}")
    List<Order> findMealInAllOrders(String mealName);
}
