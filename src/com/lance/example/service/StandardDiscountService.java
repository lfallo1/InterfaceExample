package com.lance.example.service;

import com.lance.example.service.interfaces.DiscountService;

public class StandardDiscountService implements DiscountService {

	@Override
	public Double applyDiscount(Double price) {
		Double newPrice = price - (price * 0.05);
		System.out.println(String.format("applying 5 percent standard discount. New price is %.2f", newPrice.floatValue()));
		return newPrice;
	}

}
