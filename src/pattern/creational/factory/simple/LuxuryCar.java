package pattern.creational.factory.simple;

public class LuxuryCar extends Car {

	public LuxuryCar(CarType model) {
		super(CarType.LUXARU);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building luxury car");
	}
}
