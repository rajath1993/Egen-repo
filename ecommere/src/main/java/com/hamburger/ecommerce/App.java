package com.hamburger.ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

import com.hamburger.ecommerce.branch.Branch;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	System.out.println("----------------Welcome to Texas Hamburger----------"+"\n\n");
        System.out.println("------------Choose 1.Branch 2.Menu 3.exit-------------");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        ArrayList<Branch> branches = new ArrayList<Branch>();
        Branch branch;
        switch(option) {
        	case 1:				
        		while(true) {
        			System.out.println("Choose 1:Add a branch 2:Delete a branch 3:Update a branch 4.Show Branches 5:Exit");
        			int choice = sc.nextInt();
        			branch = new Branch(branches);
        			switch(choice) {
        				case 1:
        					if(branch.addBranch(branch)) {
        						System.out.println("Added!");
        						}
        					break;
        				case 2:
        					if(branch.deleteBranch()) {
        						System.out.println("Deleted!");
        					}
        					else {
        						System.out.println("Phone number not available!");
        					}
        					break;
        				case 3:
        					if(branch.updateBranch(branch)) {
        						System.out.println("Updated!");
        					}
        					else {
        						System.out.println("Phone number not available!");
        					}
        					break;
        				case 4:
        					branch.printBranches();
        					break;
        							
        				default:break;
        			}
        			if(choice == 5)
        				break;
        		}
        		
        	case 2:
        		while(true) {
        			System.out.println("Choose 1:Add Menu 2.Delete from Menu 3.Update Menu 4.Show Menu 5.Exit");
        		}
        }
        			
        
        
    }

}
