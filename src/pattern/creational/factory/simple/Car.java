package pattern.creational.factory.simple;

public abstract class Car {

	private CarType model = null;

	public Car(CarType model) {
		this.model = model;
		arrangeParts();
	}

	protected abstract void construct();
	
	private void arrangeParts(){
		// Do one time processing here
	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
	
}
