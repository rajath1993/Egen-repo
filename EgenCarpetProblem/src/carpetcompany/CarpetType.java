package carpetcompany;

import java.util.HashMap;

public class CarpetType {
	private RoomCarpet roomCarpet;
	private HashMap<String,Double> carpetType = new HashMap<>();
	
	public CarpetType() {
		carpetType.put("frieze",1.6);
		carpetType.put("loop",2.0);
		carpetType.put("pyra",1.8);
		carpetType.put("cora",1.9);
	}
	
	public double getCarpetType(String value) {
		return carpetType.get(value);
	}
	
}
