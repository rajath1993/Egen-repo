package carpetcompany;

public class RoomCarpet extends RoomDimension{
	private double costPerSqFt;
	
	public double getCostPerSqFt() {
		return costPerSqFt;
	}

	public void setCostPerSqFt(double costPerSqFt) {
		this.costPerSqFt = costPerSqFt;
	}

	public RoomCarpet(RoomDimension size,double costPerSqFt) {
		super(size);
		this.costPerSqFt = costPerSqFt;
	}
	
	public double calcTotalCost() {
		return super.calculateArea() * this.costPerSqFt;
	}
}
