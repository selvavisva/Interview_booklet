package behaviour.state;

public class CreateState implements OrderState{

	@Override
	public void pay(Order order) {
	System.out.println("Payment complete");
	order.setState(new ShipState());
		
	}

	@Override
	public void ship(Order order) {
		System.out.println("Payment NOT complete. Shipping not yet done");
		
	}

	@Override
	public void deliver(Order order) {
		System.out.println("Payment NOT complete. NOT Delivered");
		
	}

	@Override
	public void cancel(Order order) {
		System.out.println("Order cancelled");
		
	}

}
