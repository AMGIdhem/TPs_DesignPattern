package elevator;

public class ConcreteElevatorFactory extends ElevatorFactory {
	
	public static ConcreteElevatorFactory getInstance() {
		return new ConcreteElevatorFactory();
	}
	@Override
	public Elevator createElevator(String id, int floor) {
		return new Elevator(id, floor);
	}

}
