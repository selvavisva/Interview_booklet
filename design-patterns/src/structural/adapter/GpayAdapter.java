package structural.adapter;

public class GpayAdapter implements UpiPayment{
	
	private Gpay gPay;
	
	public GpayAdapter(Gpay gPay) {
		this.gPay=gPay;
	}
	
	public void pay(int amount, String upiId) {
		gPay.payment(amount, upiId);
	}
}