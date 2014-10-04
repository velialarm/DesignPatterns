package pattern.creational.factory.simple;

public class CarFactory {
	public static Car buildCar(CarType model) {
		Car car = null;
		
		switch (model) {
		
		case SMALL:
			car = new SmallCar(model);
			break;

		case SEDAN:
			car = new SedanCar(model);
			break;

		case LUXARU:
			car = new LuxuryCar(model);
			break;

		default:
			// throw some exception
			break;
		}
		return car;
	}
}
