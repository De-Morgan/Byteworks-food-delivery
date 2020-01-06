package com.byteworks.foodvendor.models;

public enum PaymentMethod {

    CARD(2.5),
    PAYONDELIVERY(0);

    private final double discount;

    PaymentMethod(double discount){
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    void doSo(){
        PaymentMethod paymentMethod = PaymentMethod.CARD;
    }
}
