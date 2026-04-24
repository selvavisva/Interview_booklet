package creational.factory;

public class PaymentFactory {
	
	public static PaymentChannel getFactory(String type) {
		switch(type) {		
		case "CREDIT":
			return new CreditCardPayment();
		case "DEBIT":
			return new DebitCardPayment();
		case "UPI":
			return new UPIPayment();
		default:
			throw new IllegalArgumentException ("Unsupported type");
		}
	}
}
