package com.byteworks.foodvendor.controllers;


import com.byteworks.foodvendor.models.Order;
import com.byteworks.foodvendor.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/developer/{developerUserName}")
    public List<Order> getAllOrdersFromADeveloper(@PathVariable  String developerUserName){
        return orderService.getByDeveloperUsername(developerUserName);
    }

    @GetMapping("/meal/{mealName}")
    public List<Order> getAllOrdersOfAParticularMeal(@PathVariable  String mealName){
        return orderService.getByMealInAllOrders(mealName);
    }

    @PostMapping
    public Order placeOrder(@RequestBody  Order order){
        return orderService.placeOrder(order);
    }

}
