package pattern.behavioral.state;

public class RedState extends State {

	
	public RedState(State state) {
		this.setBalance(state.getBalance());
		this.setAccount(state.getAccount());
		this.initialize();
	}
	private void initialize() {
		 this.interest = 0.0;
         this.lowerLimit = -100.0;
         this.upperLimit = 0.0;
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		System.out.println("No funds available for withdrawal!");
	}

	@Override
	public void payInterest() {
		 // No interest is paid
	}

}
