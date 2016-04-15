package com.lance.example;

import java.util.Arrays;

import com.lance.example.model.Product;
import com.lance.example.model.User;
import com.lance.example.service.CheckoutService;
import com.lance.example.service.PremiumDiscountService;
import com.lance.example.service.StandardDiscountService;

public class Driver {

	public static void main(String[] args) {
		
		User user = new User();
		user.setDiscounts(Arrays.asList(new StandardDiscountService(),new PremiumDiscountService()));
		user.setProducts(Arrays.asList(new Product(1, "iPhone", 109.99), new Product(2, "laptop", 438.99), new Product(3, "Samsung phone", 129.96)));
		
		CheckoutService checkoutService = new CheckoutService();
		checkoutService.checkout(user);
	}

}
