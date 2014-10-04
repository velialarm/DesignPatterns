package pattern.behavioral.state;

public class SilverState extends State {

	
	public SilverState(State state) {
		this(state.getBalance(),state.getAccount());
	}

	 public SilverState(double balance, Account account){
		 this.setBalance(balance);
		 this.setAccount(account);
		 this.initialize();
	 }
	private void initialize() {
		this.interest = 0.0;
        this.lowerLimit = 0.0;
        this.upperLimit = 1000.0;
	}
	private void stateChangeCheck() {
		if (this.getBalance() < this.lowerLimit)
        {
            this.getAccount().setState(new RedState(this));
        }
        else if (this.getBalance() > this.upperLimit)
        {
            //this.getAccount().setState(new GoldState(this)); 
        }
	}

	@Override
	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
		this.stateChangeCheck();
	}


	@Override
	public void withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);
		this.stateChangeCheck();
	}

	@Override
	public void payInterest() {
		this.setBalance(this.interest * this.getBalance());
		this.stateChangeCheck();
	}

}
