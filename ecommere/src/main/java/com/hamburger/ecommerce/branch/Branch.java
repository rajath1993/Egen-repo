package com.hamburger.ecommerce.branch;

import java.util.List;
import java.util.Scanner;

public class Branch extends Restaurant {
	private String name;
	private Address location;
	private List<Branch> branches;
	Scanner sc = new Scanner(System.in);
	
	public Branch() {
		
	}
	
	public Branch(List<Branch> branches) {
		
		this.branches = branches;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
		

	@Override
	public boolean updateBranch(Branch branch) {
		System.out.println("Enter the contact number of the branch to be updated");
		String phoneNumber = sc.next();
		for(int i=0;i<branches.size();i++) {
			if(phoneNumber.equals(branches.get(i).location.getPhoneNumber())) {
				branch = branches.get(i);
				System.out.println("1.Update phone number 2.Update address 3.Update latitude 4.Update longitude 5.Update Branch Name");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter the new phone number: ");
					String newPhoneNumber = sc.next();
					branch.location.setPhoneNumber(newPhoneNumber);
					branches.set(i, branch);
					break;
				case 2:
					System.out.println("Enter the new address: ");
					sc.nextLine();
					String newAddress = sc.nextLine();
					branch.location.setStreetAddress(newAddress);
					branches.set(i, branch);
					break;
				case 3:
					System.out.println("Enter the latitude: ");
					Double latitude = sc.nextDouble();
					branch.location.setLatitude(latitude);
					branches.set(i, branch);
					break;
				case 4:
					System.out.println("Enter the longitude: ");
					Double longitude = sc.nextDouble();
					branch.location.setLongitude(longitude);
					branches.set(i, branch);
					break;
				case 5:
					System.out.println("Enter the new Branch name: ");
					String name = sc.next();
					branch.setName(name);
					branches.set(i, branch);
					break;
					
				default:
					System.out.println("Invalid input");
					break;
				}
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean addBranch(Branch branch) {
		Address address = new Address();
		
		System.out.println("Enter the name of the Branch");
		String name = sc.next();
		
		
		System.out.print("Enter the street address of the new branch");
		sc.nextLine();
		String streetAddress = sc.nextLine();
		System.out.println("Enter the latitude of the new branch");
		Double latitude = sc.nextDouble();
		System.out.println("Enter the longitude of the new branch");
		Double longitude = sc.nextDouble();
		System.out.println("Enter the phone number of the new branch");
		String phoneNumber = sc.next();
		
		address.setStreetAddress(streetAddress);
		address.setLatitude(latitude);
		address.setLongitude(longitude);
		address.setPhoneNumber(phoneNumber);

		
		branch.setName(name);
		branch.setLocation(address);
		
		return branches.add(branch);
	}
	
	@Override
	public boolean deleteBranch() {
		System.out.println("Enter the contact number of the branch to be deleted");
		String phoneNumber = sc.next();
		for(int i=0;i<branches.size();i++) {
			if(phoneNumber.equals(branches.get(i).location.getPhoneNumber())) {
				branches.remove(i);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Branch [name=" + name + ", location=" + location + "]";
	}

	@Override
	public void printBranches() {
		for(Branch b:branches) {
			System.out.println(b);
		}
	}
	
	
}
