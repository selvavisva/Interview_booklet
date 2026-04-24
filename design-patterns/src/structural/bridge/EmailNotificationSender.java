package structural.bridge;

public class EmailNotificationSender implements NotificationSender{

	@Override
	public void sendMessage(String message) {
		System.out.println(message+" :: "+"Email notification sent");
	}
	
}
