package elevator;


public class Main {

	public static void main(String[] args) {
		Building building = new Building(10, "id1:1", "id2:6");
		building.move("id2", "DOWN");
		System.out.println(building.requestElevator());
	}

}
