package carpetcompany;

public class RoomDimension {
	private double length;
	private double width;
	
	public RoomDimension(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public RoomDimension(RoomDimension size) {
		setLength(size.length);
		setWidth(size.width);
	}
	
	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double calculateArea() {
		return this.length*this.width;
	}
	
}
