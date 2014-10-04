package pattern.creational.factory.abstrac;

import pattern.creational.factory.abstrac.continents.Carnivore;
import pattern.creational.factory.abstrac.continents.Herbivore;

public abstract class ContinentFactory {
	public abstract Herbivore createHerbivore();
	public abstract Carnivore createCarnivore();
}
