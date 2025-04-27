package com.designPattern.factory;

public class PhonePay implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made through PhonePay.");
    }
}
