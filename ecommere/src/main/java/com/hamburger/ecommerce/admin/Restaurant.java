package com.hamburger.ecommerce.admin;

import java.util.List;

public abstract class Restaurant {
	protected List<Branch> branches;
	
	public abstract boolean updateBranch(Branch branch);
	public abstract boolean addBranch(Branch branch);
	public abstract boolean deleteBranch(Branch branch);
}
