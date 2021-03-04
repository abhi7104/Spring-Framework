package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		//getting bean of paymentModule class
		paymentModule payment=applicationContext.getBean(paymentModule.class);
		int result=payment.paymentOption(786727684,5);
		System.out.println(result);
	}

}
