package com.hamburger.ecommerce.menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MenuSection extends Menu {

	private String title;
	private Map<MenuSection, MenuItem> mapSectionToMenuItem;
	
	public MenuSection() {
		
	}
	
	public MenuSection(Map<MenuSection,MenuItem> mapSectionToMenuItem) {
		this.mapSectionToMenuItem = mapSectionToMenuItem;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private Scanner sc;
	
	@Override
	public boolean addMenuItem(MenuItem menuItem) {
		sc = new Scanner(System.in);
		
		String dailySpecials;
		double price;
		while(true) {
			System.out.println("1.Daily Specials 2.Main 3.Dessert 4.Beverages 5.Exit");
			int choice = sc.nextInt();
			MenuSection menuSection = new MenuSection();
			menuItem = new MenuItem();
			switch(choice) {
				case 1:
					System.out.println("Add new item to the Daily Specials");
					sc.nextLine();
					dailySpecials = sc.nextLine();
					System.out.println("Enter the price for the new Item");
					price = sc.nextDouble();
					menuItem.setPrice(price);
					menuItem.setTitle(dailySpecials);
					menuSection.setTitle("Daily Specials");
					
					mapSectionToMenuItem.put(menuSection, menuItem);
					
					break;
				case 2:
					System.out.println("Add new item to Main");
					sc.nextLine();
					dailySpecials = sc.nextLine();
					System.out.println("Enter the price for the new Item");
					price = sc.nextDouble();
					menuItem.setPrice(price);
					menuItem.setTitle(dailySpecials);
					menuSection.setTitle("Main");
					
					mapSectionToMenuItem.put(menuSection, menuItem);
					break;
					
				case 3:
					System.out.println("Add new item to Desserts");
					sc.nextLine();
					dailySpecials = sc.nextLine();
					System.out.println("Enter the price for the new Item");
					price = sc.nextDouble();
					menuItem.setPrice(price);
					menuItem.setTitle(dailySpecials);
					menuSection.setTitle("Dessert");
					
					mapSectionToMenuItem.put(menuSection, menuItem);
					break;
					
				case 4:
					System.out.println("Add new item to Beverages");
					sc.nextLine();
					dailySpecials = sc.nextLine();
					System.out.println("Enter the price for the new Item");
					price = sc.nextDouble();
					menuItem.setPrice(price);
					menuItem.setTitle(dailySpecials);
					menuSection.setTitle("Beverages");
					
					mapSectionToMenuItem.put(menuSection, menuItem);
					break;
			}
			if(choice == 5)
				break;
		}

		
		
		return true;
	}
	
	@Override
	public void displayMenu() {
		sc = new Scanner(System.in);
		
		System.out.println("Choose to display: ");
		System.out.println("1.Daily Specials 2.Main 3.Dessert 4.Beverages 5.Exit");
		int choice = sc.nextInt();
		String str = "+----------------------------------------------+";
		
		switch(choice) {
			case 1:
				System.out.println(str);
			    for (Entry<MenuSection, MenuItem> entry : mapSectionToMenuItem.entrySet()) {
			    	if(entry.getKey().getTitle().equals("Daily Specials")) {
			    		
			    		System.out.println(entry.getValue().getTitle()+"  $"+entry.getValue().getPrice());
			    	}
			      }
			    System.out.println(str);
				break;
			case 2:
				System.out.println(str);
			    for (Entry<MenuSection, MenuItem> entry : mapSectionToMenuItem.entrySet()) {
			    	if(entry.getKey().getTitle().equals("Main")) {
			    		System.out.println(entry.getValue().getTitle()+"  $"+entry.getValue().getPrice());
			    	}
			      }
			    System.out.println(str);
				break;
			case 3:
				System.out.println(str);
			    for (Entry<MenuSection, MenuItem> entry : mapSectionToMenuItem.entrySet()) {
			    	if(entry.getKey().getTitle().equals("Dessert")) {
			    		System.out.println(entry.getValue().getTitle()+"  $"+entry.getValue().getPrice());
			    	}
			      }
			    System.out.println(str);
				break;
			case 4:
				System.out.println(str);
			    for (Entry<MenuSection, MenuItem> entry : mapSectionToMenuItem.entrySet()) {
			    	if(entry.getKey().getTitle().equals("Beverages")) {
			    		System.out.println(entry.getValue().getTitle()+"  $"+entry.getValue().getPrice());
			    	}
			      }
			    System.out.println(str);
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid input");
				break;
					
		}
	}
	
	@Override
	public boolean deleteMenu() {
		sc = new Scanner(System.in);
		System.out.println("Enter the item to be deleted");
		String menuItemToDelete = sc.nextLine();
		
		Iterator<Map.Entry<MenuSection,MenuItem>> iterator = mapSectionToMenuItem.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<MenuSection, MenuItem> entry = iterator.next();
			if(menuItemToDelete.equals(entry.getValue().getTitle())) {
				iterator.remove();
				return true;
			}
		}	
		
		return false;
	}
	
	@Override
	public boolean updateMenu() {
		sc = new Scanner(System.in);
		System.out.println("Enter the item to be updated");
		String itemToBeUpdated = sc.nextLine();
		
		Iterator<Map.Entry<MenuSection,MenuItem>> iterator = mapSectionToMenuItem.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<MenuSection, MenuItem> entry = iterator.next();
			
			if(itemToBeUpdated.equals(entry.getValue().getTitle())) {
				MenuSection menuSection = new MenuSection();
				MenuItem menuItem = new MenuItem();
				menuSection = entry.getKey();
				menuItem = entry.getValue();
				System.out.println("Choose what needs to be updated? 1.name 2.price");
				int choice = sc.nextInt();
				switch(choice) {
					case 1:
						System.out.println("Enter the new name: ");
						sc.nextLine();
						String name = sc.nextLine();
						menuItem.setTitle(name);
						mapSectionToMenuItem.put(menuSection,menuItem);
						
						return true;
						
					case 2:
						System.out.println("Enter the new price: ");
						double newPrice = sc.nextDouble();
						menuItem.setPrice(newPrice);
						mapSectionToMenuItem.put(menuSection,menuItem);
						
						return true;
						
					default:
						System.out.println("Invalid input");
						break;
				}
			}
			
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "MenuSection [title=" + title + "]";
	}
	
	

}
