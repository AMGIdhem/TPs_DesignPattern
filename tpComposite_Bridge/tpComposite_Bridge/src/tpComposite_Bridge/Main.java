package tpComposite_Bridge;

public class Main {

	public static void main(String[] args) {
		Component product1 = new Product("product1");
		Component product03 = new Product("product03");
		Category category01 = new Category("category01");
		Category category02 = new Category("category02");
		Category category3 = new Category("category3");
		Category category1 = new Category("category1");
		
		category1.addComponent(product1);
		category1.addComponent(category01);
		category1.addComponent(category02);
		category02.addComponent(category3);
		category3.addComponent(product03);
		
		category1.printComponentName();
		
		category02.removeComponent(category3);
		System.out.println("********** after removing");
		category1.printComponentName();
		
		
	}

}
