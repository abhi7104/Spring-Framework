package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class paymentModule {
    //paymentModule depends on Payment
    @Autowired
    private Payment payment;
    //AutoWiring by Setter
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int paymentOption(long details, int amount){

        boolean verifiedDetails=payment.verifyDetails(details);
        System.out.println(payment);
        if(verifiedDetails)
            return amount;
        else
            return 0;

    }
}
