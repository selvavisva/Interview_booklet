package behaviour.state;

public class StatePatternTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.pay();
		order.ship();
		order.deliver();
	}
}
