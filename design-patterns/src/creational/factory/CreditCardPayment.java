package creational.factory;

public class CreditCardPayment implements PaymentChannel {
	
	@Override
	public void pay(int amount) {
		System.out.println("Credit card payment :: "+amount);
	}

}
