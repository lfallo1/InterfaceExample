package com.lance.example;

import java.util.Arrays;
import java.util.List;

import com.lance.example.model.Product;
import com.lance.example.service.CheckoutService;
import com.lance.example.service.StandardDiscountService;
import com.lance.example.service.PremiumDiscountService;

public class Driver {

	public static void main(String[] args) {
		
		CheckoutService checkoutService = new CheckoutService();
		checkoutService.addDiscounts(Arrays.asList(new StandardDiscountService(),new PremiumDiscountService()));
		
		List<Product> products = Arrays.asList(new Product(1, "iPhone", 109.99), new Product(2, "laptop", 438.99), new Product(3, "Samsung phone", 129.96));
		checkoutService.checkout(products);
	}

}
