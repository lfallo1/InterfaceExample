package com.lance.example.model;

import java.util.List;

import com.lance.example.service.interfaces.DiscountService;

public class User {
	private Integer id;
	private String name;
	private List<DiscountService> discounts;
	private List<Product> products;

	public User() {
	}

	public User(Integer id, String name, List<DiscountService> discounts,
			List<Product> products) {
		this.id = id;
		this.name = name;
		this.discounts = discounts;
		this.products = products;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DiscountService> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(List<DiscountService> discounts) {
		this.discounts = discounts;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
