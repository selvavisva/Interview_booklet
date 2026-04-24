package structural.bridge;

public class BridgePatternTest {
	public static void main(String[] args) {
		NotificationSender email = new EmailNotificationSender();
		Notification alert = new AlertNotification(email);
		alert.notification("ALERT");
		
		
		NotificationSender sms = new SmsNotificationSender();
		Notification warn = new WarningNotification(sms);
		warn.notification("WARN");
	}

}