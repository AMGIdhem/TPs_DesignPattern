package tpComposite_Bridge;

import java.util.ArrayList;
import java.util.List;

public class Category implements Component {
	List<Component> childs;
	String name;
	
	public Category(String name) {
		this.name = name;
		this.childs = new ArrayList<>();
	}
	

	@Override
	public void printComponentName() {
		System.out.println(name);
		childs.forEach(Component::printComponentName);
		
	}
	
	public void addComponent(Component c) {
		childs.add(c);
	}
	
	public void removeComponent(Component c) {
		childs.remove(c);
	}
	
	
	
}
