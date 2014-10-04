package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock {
	private List<IInvestor> investors = new ArrayList<>();
    private String symbol;
    private double price;
    
	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	public void Attach(IInvestor investor)
    {
        this.investors.add(investor);
    }

    public void Detach(IInvestor investor)
    {
        this.investors.remove(investor);
    }

    public void Notify()
    {
        for (IInvestor investor : this.investors)
        {
            investor.update(this);
        }

        System.out.println("");
    }
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (Math.abs(this.price - price) > 0.001)
        {
            this.price = price;
            this.Notify();
        }
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}
    
}
