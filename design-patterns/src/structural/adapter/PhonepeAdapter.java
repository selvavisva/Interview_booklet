package structural.adapter;

public class PhonepeAdapter implements UpiPayment{
	
	private Phonepe phonepe;
	
	public PhonepeAdapter(Phonepe phonepe) {
		this.phonepe=phonepe;
	}
	
	public void pay(int amount, String upiId) {
		phonepe.makePayment(amount, upiId);
	}
}