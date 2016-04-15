package com.lance.example.service;

import java.util.ArrayList;
import java.util.List;

import com.lance.example.model.Product;
import com.lance.example.model.User;
import com.lance.example.service.interfaces.DiscountService;

public class CheckoutService {
	
	/**
	 * (--- only an example - in reality services should be stateless and would not create a member var like this. --)
	 * initialize empty list that can be populated with classes implementing discount service.
	 * each discount (if any) will be used to calculate final cost of a product
	 */
	private List<DiscountService> discounts;
	
	/**
	 * Add multiple DiscountServices to the list
	 * @param discounts
	 */
	public void setDiscounts(List<DiscountService> discounts){
		this.discounts = new ArrayList<DiscountService>();
		this.discounts.addAll(discounts);
	}
	
	/**
	 * Given a list of products, apply discounts and determine final costs
	 * @param products
	 */
	public void checkout(User user){
		
		List<Product> products = user.getProducts();
		setDiscounts(user.getDiscounts());
		
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
