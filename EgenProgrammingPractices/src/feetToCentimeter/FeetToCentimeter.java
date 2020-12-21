package feetToCentimeter;

public class FeetToCentimeter {

	public FeetToCentimeter() {
	}
	
	public double feetToCenti(double feet) {
		double centi = feet * 30.48;
		return centi;
	}
	
	public double feetToCenti(long feet) {
		double centi = feet * 30.48;
		return (double)centi;
	}
	
}
