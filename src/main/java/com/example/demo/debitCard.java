package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class debitCard implements Payment{
    public Boolean verifyDetails(long details)
    {
        System.out.println("Verifying Debit Card Details for payment");
        return true;
    }
}
