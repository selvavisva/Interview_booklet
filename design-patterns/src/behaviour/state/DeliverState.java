package behaviour.state;

public class DeliverState  implements OrderState{

	@Override
	public void pay(Order order) {
	System.out.println("Already delivered");
	
		
	}

	@Override
	public void ship(Order order) {
		System.out.println("Already delivered");
	}

	@Override
	public void deliver(Order order) {
		System.out.println("Already delivered");		
	}

	@Override
	public void cancel(Order order) {
		System.out.println("Order cancelled");
		
	}
}
