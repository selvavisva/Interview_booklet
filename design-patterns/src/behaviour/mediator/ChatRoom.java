package behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {

	List<ChatUser> users = new ArrayList<>();
	 
	
	@Override
	public void addUser(ChatUser user) {
		users.add(user);
		
	}

	@Override
	public void mediateMsg(String message, ChatUser sender) {
		for(ChatUser user: users) {
			if(sender!=user) {
				user.receiveMessage(message);
			}
		}
	}

}
