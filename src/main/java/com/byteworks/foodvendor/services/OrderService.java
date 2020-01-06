package com.byteworks.foodvendor.services;

import com.byteworks.foodvendor.models.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order placeOrder(Order order);

   List<Order> getByDeveloperUsername(String developerName);


    List<Order> getByMealInAllOrders(String mealName);

}
