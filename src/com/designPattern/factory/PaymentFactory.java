package com.designPattern.factory;

public class PaymentFactory {
    public static Payment createPayment(String service) {
        if (service.equals("PhonePay")) {
            return new PhonePay();
        } else if (service.equals("GooglePay")) {
            return new GooglePay();
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + service);

        }
    }
}