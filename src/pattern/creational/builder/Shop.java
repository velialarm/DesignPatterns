package pattern.creational.builder;

/**
 *Directer 
 * create step to build object
 */
public class Shop {
public void construct(VehicleBuilder vehicleBuilder){
	vehicleBuilder.buildFrame();
	vehicleBuilder.buildEngine();
	vehicleBuilder.buildWheels();
	vehicleBuilder.buildDoors();
}
}
