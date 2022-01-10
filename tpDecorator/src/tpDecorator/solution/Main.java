package tpDecorator.solution;

public class Main {

	public static void main(String[] args) {
		Assurance assurance = new ResponsabiliteCivile();
		System.out.println(assurance.cout());
		assurance = new Vol(assurance);
		System.out.println(assurance.cout());
		assurance = new Inondation(assurance);
		System.out.println(assurance.cout());

	}

}
