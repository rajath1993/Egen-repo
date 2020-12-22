package carpetcompany;

import java.util.Scanner;


/*
 * Made use of inheritance to implement the carpet problem
 *  
 * */

public class Main {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.println("Enter the length of the room: ");
		double length = reader.nextDouble();
		
		System.out.println("Enter the width of the room: ");
		double width = reader.nextDouble();
		
		System.out.println("Enter the price per square foot");
		double cost = reader.nextDouble();
		
		RoomCarpet roomCarpet = new RoomCarpet(length,width,cost);
		
		System.out.println("Total Cost: "+roomCarpet.calcTotalCost());
	}

}
