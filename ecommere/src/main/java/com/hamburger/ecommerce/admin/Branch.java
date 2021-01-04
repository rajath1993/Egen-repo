package com.hamburger.ecommerce.admin;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch extends Restaurant {
	private String name;
	private Address location;
	
	
	

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
		
		return false;
	}
	@Override
	public boolean addBranch(Branch branch) {
		System.out.println("Branch details: "+branch);
		this.branches = new ArrayList<Branch>();
		return this.branches.add(branch);
		
	}
	@Override
	public boolean deleteBranch(Branch branch) {
		return this.branches.remove(branch);
		
	}
	
	@Override
	public String toString() {
		return "Branch [name=" + name + ", location=" + location + "]";
	}
}
