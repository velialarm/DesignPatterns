package pattern.behavioral.state;

public class Account {

	private State state;
	private String owner;
	private double balance;
	public Account(String owner) {
		 // New accounts are 'Silver' by default
		this.owner = owner;
		this.setState( new SilverState(0.0, this)); 
	}
	public double getBalance() {
		return balance;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
