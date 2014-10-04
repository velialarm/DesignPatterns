package pattern.behavioral.chain.responsibility.demo;

public class VicePresident extends Approver {

	@Override
	public void processRequest(Purchase purchase) {
		if (purchase.getAmount() < 25000.0) {
			System.out.printf("%s approved request %d\n",this.getClass().toString(),purchase.getNumber());
		}else if (this.getSuccessor() != null){
			this.getSuccessor().processRequest(purchase);
		}
	}
}
