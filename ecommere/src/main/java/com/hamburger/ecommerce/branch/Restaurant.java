package com.hamburger.ecommerce.branch;

import java.util.List;

public abstract class Restaurant {
	
	public abstract boolean updateBranch(Branch branch);
	public abstract boolean addBranch(Branch branch);
	public abstract boolean deleteBranch();
	public abstract void printBranches();
}
