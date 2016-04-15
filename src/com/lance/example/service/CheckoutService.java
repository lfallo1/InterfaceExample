package com.lance.example.service;

import java.util.ArrayList;
import java.util.List;

import com.lance.example.model.Product;
import com.lance.example.service.interfaces.DiscountService;

public class CheckoutService {
	
	//initialize empty list that can be populated with classes implementing discount service.
	//each discount (if any) will be used to calculate final cost of a product
	private List<DiscountService> discounts = new ArrayList<DiscountService>();
	
	/**
	 * Add a DiscountService to list
	 * @param discount
	 */
	public void addDiscount(DiscountService discount){
		this.discounts.add(discount);
	}
	
	/**
	 * Add multiple DiscountServices to the list
	 * @param discounts
	 */
	public void addDiscounts(List<DiscountService> discounts){
		this.discounts.addAll(discounts);
	}
	
	/**
	 * clear list
	 */
	public void resetDiscounts(){
		this.discounts = new ArrayList<>();
	}
	
	/**
	 * Given a list of products, apply discounts and determine final costs
	 * @param products
	 */
	public void checkout(List<Product> products){
		for (int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			System.out.println("Processing item: " + p.getName());
			
			//apply each discount
			for (int j = 0; j < discounts.size(); j++) {
				Double discountedPrice = discounts.get(j).applyDiscount(p.getPrice());
				p.setPrice(discountedPrice);
			}
			System.out.print("\r\n");
		}
	}
}
