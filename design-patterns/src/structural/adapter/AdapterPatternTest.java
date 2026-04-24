package structural.adapter;

public class AdapterPatternTest {
	public static void main(String[] args) {
		
		UpiPayment paymentChannel = PaymentFactory.getPaymentFactory("Gpay");
		paymentChannel.pay(1000, "gpay_user_00087");
	}

}
