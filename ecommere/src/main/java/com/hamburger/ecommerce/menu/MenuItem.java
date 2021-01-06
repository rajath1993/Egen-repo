package com.hamburger.ecommerce.menu;

public class MenuItem {
	private String title;
	private double price;
	
	
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "MenuItem [title=" + title + ", price=" + price + "]";
	}
	
	
}
