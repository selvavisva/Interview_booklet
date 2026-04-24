package structural.bridge;

public class AlertNotification extends Notification{
	public AlertNotification(NotificationSender sender) {
		super(sender);
	}
	
	public void notification(String message) {
		sender.sendMessage(message);
	}
}
