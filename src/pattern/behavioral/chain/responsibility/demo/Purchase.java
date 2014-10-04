package pattern.behavioral.chain.responsibility.demo;

public class Purchase {

	private int number;
	private double amount;
	
	
	public Purchase(int number, double amount) {
		this.number = number;
		this.amount = amount;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
