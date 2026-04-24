package creational.factory;

public class FactoryPatternTest {
	
	public static void main(String[] args) {
		PaymentChannel paymentMode = PaymentFactory.getFactory("UPI");
		paymentMode.pay(5200);
	}

}
