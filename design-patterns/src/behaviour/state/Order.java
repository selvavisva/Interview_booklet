package behaviour.state;

public class Order {
		
	OrderState state;
	public Order() {
		this.state = new CreateState();
	}
	
	public void setState(OrderState state) {
		this.state=state;
	}
	
	public void pay() {
	        state.pay(this);
	}

    public void ship() {
        state.ship(this);
    }

    public void deliver() {
        state.deliver(this);
    }

    public void cancel() {
        state.cancel(this);
    }
}
