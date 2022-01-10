package elevator;


public class Elevator {
	String id;
	int floor;
	
	ElevatorState resting;
	ElevatorState up;
	ElevatorState down;
	ElevatorState stop;
	
	ElevatorState atmState;
	
	public Elevator(String id, int floor) {
		this.id = id;
		this.floor = floor;
		
		resting = new Resting(this);
		up = new Up(this);
		down = new Down(this);
		stop = new Stop(this);
		
		atmState = resting;
	}
	
	public void setElevatorState(ElevatorState newElevatorState) {
		atmState = newElevatorState;
	}
	
	public ElevatorState getElevatorState() {
		return atmState;
	}
	
	public void down() {
		atmState.down();
	}
	
	public void up() {
		atmState.up();
	}
	
	public void stop(int floor) {
		atmState.stop(floor);
	}
	
	public int distance(int destination) {
		return atmState.distance(destination);
	}
	
	public ElevatorState getRestingState() { return resting; }
	public ElevatorState getUpState() { return up; }
	public ElevatorState getDownState() { return down; }
	public ElevatorState getStopState() { return stop; }
	
}
