package pattern.creational.builder;

public class MotorCycleBuilder extends VehicleBuilder {

	
	public MotorCycleBuilder() {
		//Vehicle vehicle = new Vehicle("MotorCycle");
//		Vehicle vehicle = this.getVehicle();
		Vehicle vehicle  = new Vehicle("MotorCycle");
	}

	@Override
	void buildFrame() {
		
	}

	@Override
	void buildEngine() {
		
	}

	@Override
	void buildWheels() {
		
	}

	@Override
	void buildDoors() {
		
	}

}
