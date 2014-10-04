package pattern.creational.factory.simple;

public class SmallCar extends Car {

	public SmallCar(CarType model) {
		super(model);
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
	}

}
