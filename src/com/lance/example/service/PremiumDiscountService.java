package com.lance.example.service;

import com.lance.example.service.interfaces.DiscountService;

public class PremiumDiscountService implements DiscountService {

	@Override
	public Double applyDiscount(Double price) {
		Double newPrice = price - (price * 0.15);
		System.out.println(String.format("applying 15 percent discount on total order due to premium member. New price is %.2f", newPrice.floatValue()));
		return newPrice;
	}

}
