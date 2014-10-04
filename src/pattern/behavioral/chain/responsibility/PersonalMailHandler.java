package pattern.behavioral.chain.responsibility;

public class PersonalMailHandler implements EmailHandler {

	@Override
	public void setNext(EmailHandler handler) {

	}

	@Override
	public void handleRequest(Email email) {

	}

}
