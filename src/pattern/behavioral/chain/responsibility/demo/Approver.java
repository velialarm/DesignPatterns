package pattern.behavioral.chain.responsibility.demo;

public abstract class Approver {
	private Approver successor;
	
	public void manageSuccesor(Approver successor){
		this.successor = successor;
	}
	public abstract void processRequest(Purchase purchase);
	
	
	public Approver getSuccessor() {
		return successor;
	}
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
}
