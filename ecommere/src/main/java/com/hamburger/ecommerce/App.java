package com.hamburger.ecommerce;

import java.util.Scanner;

import com.hamburger.ecommerce.admin.Address;
import com.hamburger.ecommerce.admin.Branch;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	System.out.println("----------------Welcome to Texas Hamburger----------");
    	System.out.println();
        System.out.println("-------Are you 1.Admin 2.User ?------");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        switch(input){
        	case 1: 
        		System.out.println("You chose admin");
	        	while(true) {
	            	System.out.println("Choose 1:Add a branch 2:Delete a branch 3:Update a branch 4:Exit");
	            	int choice = sc.nextInt();
	        		switch(choice) {
	        			case 1:
	        				Address address = new Address();
	        				System.out.println("Enter the name of the Branch");
	        				String name = sc.next();
	        				
	        				System.out.println("Enter the street address of the new branch");
	        				String streetAddress = sc.next();
	        				System.out.println("Enter the city of the new branch");
	        				String city = sc.next();
	        				System.out.println("Enter the state of the new branch");
	        				String state = sc.next();
	        				System.out.println("Enter the zipcode of the new branch");
	        				String zipcode = sc.next();
	        				System.out.println("Enter the country of the new branch");
	        				String country = sc.next();
	        				System.out.println("Enter the latitude of the new branch");
	        				Double latitude = sc.nextDouble();
	        				System.out.println("Enter the longitude of the new branch");
	        				Double longitude = sc.nextDouble();
	        				
	        				
	        				address.setStreetAddress(streetAddress);
	        				address.setCity(city);
	        				address.setCountry(country);
	        				address.setLatitude(latitude);
	        				address.setState(state);
	        				address.setLongitude(longitude);
	        				address.setZipcode(zipcode);
	        				
	        				Branch branch = new Branch();
	        				branch.setName(name);
	        				branch.setLocation(address);
	        				
	        				if(branch.addBranch(branch)) {
	        					System.out.println("New branch added!!");
	        				}else {
	        					System.out.println("Unable to add branch!");
	        				}
	        				break;
	        			default: break;
	        		}
	        		if(choice == 4) {
	        			break;
	        		}
	        	}
        		break;
		case 2:System.out.println("You chose user");
        	break;
        	default:System.out.println("Wrong choice!");
        	break;
        }
        
        
    }

}
