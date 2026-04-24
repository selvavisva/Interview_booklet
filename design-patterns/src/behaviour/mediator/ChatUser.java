package behaviour.mediator;

public class ChatUser {
	
	private Mediator chatRoom;
	private String name;
	
	ChatUser(Mediator chatRoom, String name){
		this.chatRoom=chatRoom;
		this.name=name;
		chatRoom.addUser(this);
	}
	
	public void receiveMessage(String message) {
		System.out.println("Received message :: "+message);
		System.out.println("msg box of name :: "+name);
		
	}
	
	public void sendMessage(String message) {
		chatRoom.mediateMsg(message, this);		
	}
	
	public String toString() {
		return name;
	}
	
}