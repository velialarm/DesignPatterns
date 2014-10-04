package pattern.creational.factory.method;

import pattern.creational.factory.method.pizza.PepperoniPizza;
import pattern.creational.factory.method.pizza.Pizza;

class PepperoniPizzaFactory  extends PizzaFactory{

	@Override
	public Pizza CreatePizza() {
		return new PepperoniPizza();
	}

}
