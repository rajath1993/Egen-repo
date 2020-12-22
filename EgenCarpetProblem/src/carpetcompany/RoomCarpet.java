package carpetcompany;

public class RoomCarpet extends RoomDimension{
	private double costPerSqFt;
	
	public RoomCarpet(double length,double width,double costPerSqFt) {
		super(length,width);
		this.costPerSqFt = costPerSqFt;
	}
	
	public double calcTotalCost() {
		return super.calculateArea() * this.costPerSqFt;
	}
}
