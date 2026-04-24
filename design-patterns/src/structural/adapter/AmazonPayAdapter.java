package structural.adapter;

public class AmazonPayAdapter implements UpiPayment{
	
	private AmazonPay amazonPay;
	
	public AmazonPayAdapter(AmazonPay amazonPay) {
		this.amazonPay=amazonPay;
	}
	
	public void pay(int amount, String upiId) {
		amazonPay.transferMoney(amount, upiId);
	}
}
