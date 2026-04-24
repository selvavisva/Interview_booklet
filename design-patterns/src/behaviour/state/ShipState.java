package behaviour.state;

public class ShipState implements OrderState{

	@Override
	public void pay(Order order) {
	System.out.println("Payment complete");
	
		
	}

	@Override
	public void ship(Order order) {
		System.out.println("Shipping completed");
		order.setState(new DeliverState());
		
	}

	@Override
	public void deliver(Order order) {
		System.out.println("Shipping in progress. NOT Delivered");
		
	}

	@Override
	public void cancel(Order order) {
		System.out.println("Order cancelled");
		
	}
}
