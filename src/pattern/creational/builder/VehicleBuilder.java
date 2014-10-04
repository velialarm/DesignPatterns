package pattern.creational.builder;

abstract class VehicleBuilder {

	private Vehicle vehicle;
	
	abstract void buildFrame();
	abstract void buildEngine() ;
	abstract void buildWheels() ;
	abstract void buildDoors() ;
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
