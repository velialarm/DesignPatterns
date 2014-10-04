package pattern.behavioral.chain.responsibility.demo;

public class President extends Approver {

	@Override
	public void processRequest(Purchase purchase) {

		if (purchase.getAmount() < 100000.0) {
			System.out.printf("%s approved request %d\n",this.getClass().toString(),purchase.getNumber());
		}else{
			System.out.printf("Request %d requires an executive meeting!\n",purchase.getNumber());
		}
	}

}
