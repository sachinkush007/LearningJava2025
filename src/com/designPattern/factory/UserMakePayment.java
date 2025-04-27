package com.designPattern.factory;

public class UserMakePayment {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.createPayment("GooglePay");
        payment.pay(100);

        Payment payment1=PaymentFactory.createPayment("PhonePay");
        payment.pay(200);
    }
}
