package behaviour.mediator;

public interface Mediator {
	void addUser(ChatUser user);
	void mediateMsg(String message, ChatUser sender);
}
