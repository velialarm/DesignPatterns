package pattern.creational.factory.abstrac;

import pattern.creational.factory.abstrac.animals.Lion;
import pattern.creational.factory.abstrac.animals.Wildebeest;
import pattern.creational.factory.abstrac.continents.Carnivore;
import pattern.creational.factory.abstrac.continents.Herbivore;

public class AfricaFactory extends ContinentFactory {

	@Override
	public Herbivore createHerbivore() {
		return new Wildebeest();
	}

	@Override
	public Carnivore createCarnivore() {
		return new Lion();
	}

}
