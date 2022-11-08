package patterns.behavioral.mediator.real_example;

public interface ChatMediator {

	void sendMessage(String msg, User user);

	void addUser(User user);
}
