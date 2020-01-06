package com.byteworks.foodvendor.services;

import com.byteworks.foodvendor.models.Meal;
import com.byteworks.foodvendor.models.Order;
import com.byteworks.foodvendor.models.PaymentMethod;
import com.byteworks.foodvendor.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private static final double CHARGERATEPERDISTANCE = 10.0;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private MealService mealService;



    @Autowired
    private UserService userService;


    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order placeOrder(Order order) {

        ///validate the developer making the request
        userService.findUserByUsername(order.getDeveloperUsername());

        /// get total cost from list of ordered food
        double totalcost = 0;
        List<Meal> orderdedFood = new ArrayList<>();
        order.getRequestedFoodNames()
                .stream()
                .map(foodName->mealService.getMealByName(foodName)).forEach(orderdedFood::add);
        for (Meal meal: orderdedFood) totalcost += meal.getPrice();


        /// apply the discount calculation
        totalcost = (100 - order.getPaymentMethod().getDiscount())/100 * totalcost;

        /// if office delivery, apply the exact charge
        if(order.getOfficeDelivery()){
            totalcost = totalcost*= (order.getDistance() *CHARGERATEPERDISTANCE);
        }

        order.setTotalCost(totalcost);

        return  orderRepository.save(order);
    }

    @Override
    public List<Order> getByDeveloperUsername(String developerName) {
        return orderRepository.findByDeveloperUsername(developerName);
    }


    @Override
    public List<Order> getByMealInAllOrders(String mealName) {
        return orderRepository.findMealInAllOrders(mealName);
    }
}
