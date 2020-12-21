package feetToCentimeter;

public class PrintCentimeter {
	public PrintCentimeter() {
	}
	
	public static void printFeetToCenti(double feet) {
		FeetToCentimeter ft = new FeetToCentimeter();
		double centi = ft.feetToCenti(feet);
		if(centi<0) {
			System.out.println("Invalid input!");
		}else {
			System.out.println(centi+"cm");
		}
	}
	
	public static void printFeetToCenti(long feet) {
		FeetToCentimeter ft = new FeetToCentimeter();
		double centi = ft.feetToCenti(feet);
		if(centi<0) {
			System.out.println("Invalid input!");
		}else {
			System.out.println(centi+"cm");
		}
	}
}
