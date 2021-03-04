package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class upiPay implements Payment {
    public Boolean verifyDetails(long details)
    {
        System.out.println("Verifying Upi Details for payment");
        return true;
    }
}
