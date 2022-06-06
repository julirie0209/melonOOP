package com.melons.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MelonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MelonsApplication.class, args);
		
		SalesPeople jane = new SalesPeople();
		System.out.println(jane.calculateMonthlyPay(500000));
		
		InternSalesPeople jake = new InternSalesPeople();
		System.out.println(jake.calculateMonthlyPay(500000));
	}

}
