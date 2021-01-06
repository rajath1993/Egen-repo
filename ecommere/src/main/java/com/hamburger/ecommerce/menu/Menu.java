package com.hamburger.ecommerce.menu;

import java.util.List;

public abstract class Menu {
	
	public abstract boolean addMenuItem(MenuItem menuItem);
	public abstract void displayMenu();
	public abstract boolean deleteMenu();
	public abstract boolean updateMenu();
}
