package pattern.behavioral.chain.responsibility;

public class EmailClient {

	private EmailProcessor processor;
	
	@SuppressWarnings("unused")
	private void createProcessor(){
		processor = new EmailProcessor();
		processor.addHandler(new BusinessMailHandler());
		processor.addHandler(new PersonalMailHandler());
	}
	public void addRule(EmailHandler handler){
		processor.addHandler(handler);
	}
	public void emailReceived(Email email){
		processor.handleRequest(email);
	}
}
