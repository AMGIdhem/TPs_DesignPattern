package elevator;

public abstract class ElevatorFactory {
	public abstract Elevator createElevator(String id, int floor);
}
