package pattern.behavioral.chain.responsibility.demo;

public class TeamLead extends Approver {

	@Override
	public void processRequest(Purchase purchase) {
		if (purchase.getAmount() < 10000.0) {
			System.out.printf("%s approved request %d\n",this.getClass().toString(),purchase.getNumber());
		}else if (this.getSuccessor() != null){
			this.getSuccessor().processRequest(purchase);
		}
	}

}
