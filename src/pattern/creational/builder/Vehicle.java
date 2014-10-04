package pattern.creational.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *Products
 */
public class Vehicle {
	private String vehicleType;
	private Map<String, String> parts = new HashMap<>();
	
	public Vehicle(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public void Show(){
		
	}
	
}
