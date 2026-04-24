package behaviour.stratergy;

public class DebitCardPayment  implements PaymentChannel {
	@Override
	public void pay(int amount) {
		System.out.println("Debit card payment :: "+amount);
	}

}
