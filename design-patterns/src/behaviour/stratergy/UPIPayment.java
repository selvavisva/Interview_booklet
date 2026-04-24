package behaviour.stratergy;

public class UPIPayment  implements PaymentChannel {	
	@Override
	public void pay(int amount) {
		System.out.println("UPI payment :: "+amount);
	}
}
