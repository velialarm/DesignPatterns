package pattern.behavioral.observer;

public class Investor implements IInvestor {

	private String name;
	private Stock stock;
	
	public Investor(String name) {
		this.name = name;
	}

	@Override
	public void update(Stock stock) {
		System.out.printf("Notified %s of %s's " + "change to %s\n", this.name, stock.getSymbol(), stock.getPrice());
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
