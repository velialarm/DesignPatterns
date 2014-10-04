package pattern.creational.factory.method;

import pattern.creational.factory.method.pizza.HawwaiPizza;
import pattern.creational.factory.method.pizza.Pizza;

public class HawwaiPizzaFactory extends PizzaFactory {

	@Override
	public Pizza CreatePizza() {
		return new HawwaiPizza();
	}

}
