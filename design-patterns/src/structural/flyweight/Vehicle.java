package structural.flyweight;

public class Vehicle {
	
	private String type;
	
	public Vehicle(String type){
		this.type=type;
	}
	
	public void move(int x, int y) {
		System.out.println("moving vehicle :: "+x+" : "+y);
	}

}
