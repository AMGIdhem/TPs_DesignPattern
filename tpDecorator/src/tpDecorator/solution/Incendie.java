package tpDecorator.solution;

public class Incendie extends DecorateurAbstrait {

	public Incendie(Assurance assurance) {
		super(assurance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return assurance.cout()+200;
	}

}
