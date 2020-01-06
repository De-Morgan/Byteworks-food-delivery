package com.byteworks.foodvendor.models;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Document(collection = "orders")
public class Order {

    @Id
    private String id;

    @NotBlank
    private String developerUsername;


    private List<String> requestedFoodNames;

    @Min(value = 0L, message = "The totalcost must be positive")
    private double totalCost;

    private PaymentMethod paymentMethod;

    @NotNull
    private Boolean officeDelivery;


    private  double distance;



    public Order(String developerUsername, List<String> requestedFoodNames, PaymentMethod paymentMethod, Boolean officeDelivery, double distance) {
        this.developerUsername = developerUsername;
        this.requestedFoodNames = requestedFoodNames;
        this.paymentMethod = paymentMethod;
        this.officeDelivery = officeDelivery;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeveloperUsername() {
        return developerUsername;
    }

    public void setDeveloperUsername(String developerUsername) {
        this.developerUsername = developerUsername;
    }

    public List<String> getRequestedFoodNames() {
        return requestedFoodNames;
    }

    public void setRequestedFoodNames(List<String> requestedFoodNames) {
        this.requestedFoodNames = requestedFoodNames;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Boolean getOfficeDelivery() {
        return officeDelivery;
    }

    public void setOfficeDelivery(Boolean officePickUp) {
        this.officeDelivery = officePickUp;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if(!officeDelivery) distance = 0;
        else
        this.distance = distance;
    }
}
