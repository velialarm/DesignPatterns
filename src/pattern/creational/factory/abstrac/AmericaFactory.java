package pattern.creational.factory.abstrac;

import pattern.creational.factory.abstrac.animals.Bison;
import pattern.creational.factory.abstrac.animals.Wolf;
import pattern.creational.factory.abstrac.continents.Carnivore;
import pattern.creational.factory.abstrac.continents.Herbivore;

public class AmericaFactory extends ContinentFactory {

	@Override
	public Herbivore createHerbivore() {
		return new Bison();
	}

	@Override
	public Carnivore createCarnivore() {
		return new Wolf();
	}

}
