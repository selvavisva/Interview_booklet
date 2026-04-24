package structural.bridge;

public abstract class Notification {
	
	protected NotificationSender sender;
	
	public Notification(NotificationSender sender){
		this.sender=sender;
	}
	
	public abstract void notification(String message);
}
