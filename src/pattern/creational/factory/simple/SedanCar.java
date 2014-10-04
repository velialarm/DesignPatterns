package pattern.creational.factory.simple;

public class SedanCar extends Car {

	public SedanCar(CarType model) {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building sedan car");
	}

}
