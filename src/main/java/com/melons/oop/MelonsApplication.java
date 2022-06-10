package com.melons.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.melons.orders.DomesticMelonOrder;
import com.melons.orders.InternationalMelonOrder;

@SpringBootApplication
public class MelonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MelonsApplication.class, args);
		
		InternationalMelonOrder order0 = new 
				InternationalMelonOrder("Christmas melon", 6, "AUS");
		
		System.out.println(order0.getSpecies());
		System.out.println(order0.getOrderType());
		System.out.println(order0.getQty());
		System.out.println(order0.getTotal(order0.getBasePrice()));
		
		InternationalMelonOrder order2 = new 
				InternationalMelonOrder("honeydew", 6, "AUS");
		
		System.out.println(order2.getSpecies());
		System.out.println(order2.getOrderType());
		System.out.println(order2.getQty());
		System.out.println(order2.getTotal(order0.getBasePrice()));
		
		DomesticMelonOrder order1 = new
				DomesticMelonOrder("cantaloupe", 8);
		
		System.out.println(order1.getSpecies());
		System.out.println(order1.getOrderType());
		System.out.println(order1.getQty());
		System.out.println(order1.isHasShipped());
		order1.markShipped();
		System.out.println(order1.isHasShipped());
	}
}