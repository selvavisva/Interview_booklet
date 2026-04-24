package behaviour.stratergy;

public class StratergyPatternTest {
	public static void main(String[] args) {
		
		PaymentService service = new PaymentService(new CreditCardPayment());
		service.processPayment(15000);
	}
}
