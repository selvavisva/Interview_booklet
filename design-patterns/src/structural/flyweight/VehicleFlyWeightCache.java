package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFlyWeightCache {

	private static Map<String, Vehicle> cache = new HashMap<>();
	
	public static Vehicle getVehicle(String type) {		
		cache.putIfAbsent(type, new Vehicle(type));		
		return cache.get(type);
	}
}
