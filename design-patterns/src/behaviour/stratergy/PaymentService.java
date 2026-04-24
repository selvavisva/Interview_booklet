package behaviour.stratergy;

public class PaymentService {	
	private PaymentChannel paymentChannel;
	
	public PaymentService(PaymentChannel paymentChannel){
		this.paymentChannel=paymentChannel;	
	}
	
	public void processPayment(int amount) {
		paymentChannel.pay(amount);
		
	}
	

}
