package tpComposite_Bridge;


public class Product implements Component {
	private String name;

	public Product(String name) {
		this.name = name;
	}

	@Override
	public void printComponentName() {
		
		System.out.println(name);
	}
}
