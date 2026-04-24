package behaviour.mediator;

public class MediatorTest {
	public static void main(String[] args) {
		Mediator room = new ChatRoom();
		ChatUser user1 = new ChatUser(room, "Guru");
		ChatUser user2 = new ChatUser(room, "Rahul");
		ChatUser user3 = new ChatUser(room, "Bharat");
		ChatUser user4 = new ChatUser(room, "Vinay");
		
		Thread t1 = new Thread(() -> {
			user1.sendMessage("Hello Everyone  by :: "+user1.toString());			
		});
		
		Thread t2 = new Thread(() -> {
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			user2.sendMessage("Hello Everyone  by :: "+user2.toString());		
		});
		
		Thread t3 = new Thread(() -> {
			try {
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			user3.sendMessage("Hello Everyone  by :: "+user3.toString());		
		});
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
