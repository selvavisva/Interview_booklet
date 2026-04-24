package structural.bridge;

public class WarningNotification  extends Notification{
	public WarningNotification(NotificationSender sender) {
		super(sender);
	}
	
	public void notification(String message) {
		sender.sendMessage(message);
	}
}
