package elevator;


public class Resting implements ElevatorState {
	Elevator elevator;

	public Resting(Elevator newElevator) {
		elevator = newElevator;
	}

	@Override
	public void down() {
		System.out.println("elevator "+elevator.id+" moved to down");
		elevator.setElevatorState(elevator.getDownState());
	}

	@Override
	public void up() {
		System.out.println("elevator "+elevator.id+" moved to up");
		elevator.setElevatorState(elevator.getUpState());
	}

	@Override
	public void stop(int floor) {
		System.out.println("elevator "+elevator.id+" stoped at floor :"+floor);
		elevator.setElevatorState(elevator.getStopState());
		
	}

	@Override
	public int distance(int destination) {
		return Math.abs(destination-elevator.floor);
	}

}
