package structural.flyweight;

public class FlyWeightPatternTest {
	
	public static void main(String[] args) {
		Vehicle car = VehicleFlyWeightCache.getVehicle("Car");
		car.move(20,40);
	}

}
