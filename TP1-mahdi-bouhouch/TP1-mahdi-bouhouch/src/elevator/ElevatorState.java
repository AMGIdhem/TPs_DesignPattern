package elevator;

public interface ElevatorState {
	public void down();
	public void up();
	public void stop(int floor);
	public int distance(int destination);
}
