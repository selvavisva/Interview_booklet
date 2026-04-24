package structural.bridge;

public class SmsNotificationSender implements NotificationSender{

	@Override
	public void sendMessage(String message) {
		System.out.println(message+" :: "+"SMS notification sent");
	}
	
}