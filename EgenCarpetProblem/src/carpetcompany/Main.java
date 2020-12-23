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
		
		double cost = 0.0;
		
		System.out.println("Select the type of Carpet: 1-Frieze, 2-Loop, 3-Pyra, 4-Cora");
		String type = reader.next();
		CarpetType ctype = new CarpetType();
		cost = ctype.getCarpetType(type.toLowerCase());
		
		reader.close();
		RoomDimension roomDimension = new RoomDimension(length,width);
		RoomCarpet roomCarpet = new RoomCarpet(roomDimension,cost);
		
		System.out.println("Total Cost: "+roomCarpet.calcTotalCost());
	}

}
