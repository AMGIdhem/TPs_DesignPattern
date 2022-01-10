package elevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Building {
	ElevatorFactory elevatorFactory = ConcreteElevatorFactory.getInstance();
	int numberOfFloors;
	List<Elevator> elevators = new ArrayList<Elevator>();
	
	public Building(int numberOfFloors, String... elevatorsDetails) {
		this.numberOfFloors = numberOfFloors;
		for(int i=0; i<elevatorsDetails.length; i++) {
			String[] splits = elevatorsDetails[i].split(":");
			elevators.add(elevatorFactory.createElevator(splits[0], Integer.parseInt(splits[1])));
			//elevators.add(new Elevator(splits[0], Integer.parseInt(splits[1])));
		}
	}
	
	public void move(String id, String action) {
		Elevator e = elevators.stream()
				.filter(el -> id.equals(el.id))
				.findAny()
				.orElse(null);
		if (action.equals("DOWN")) e.down();
		else if (action.equals("UP")) e.up();
		
	}
	
	public void stopAt(String id, int floor) {
		Elevator e = elevators.stream()
				.filter(el -> id.equals(el.id))
				.findAny()
				.orElse(null);
		e.stop(floor);
	}
	
	public String requestElevator() {
		HashMap<String, Integer> distances = new HashMap<String, Integer>();
		for(Elevator e : elevators) {
			distances.put(e.id, e.distance(numberOfFloors));
		}
		String key = Collections.min(distances.entrySet(), Map.Entry.comparingByValue()).getKey();
		return key;
	}
	
	public String requestElevator(int n) {
		HashMap<String, Integer> distances = new HashMap<String, Integer>();
		for(Elevator e : elevators) {
			distances.put(e.id, e.distance(n));
		}
		String key = Collections.min(distances.entrySet(), Map.Entry.comparingByValue()).getKey();
		return key;
	}
	
	
	

}
