package pattern.behavioral.state;

public abstract class State {
	protected double interest;

    protected double lowerLimit;

    protected double upperLimit;

    private Account account;

    private double balance;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void payInterest();

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    
    
}
