package structural.adapter;

public class PaymentFactory {
	
	public static UpiPayment getPaymentFactory(String type) {
		
		switch(type) {
		case "AmazonPay":
			return new AmazonPayAdapter(new AmazonPay());
		case "Gpay":
			return new GpayAdapter(new Gpay());
		case "Phonepe":
			return new PhonepeAdapter(new Phonepe());
		default:
			throw new IllegalArgumentException("Invalid Type");
		}
	}
}
