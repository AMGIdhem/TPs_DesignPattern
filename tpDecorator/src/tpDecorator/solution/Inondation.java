package tpDecorator.solution;

public class Inondation extends DecorateurAbstrait {

	public Inondation(Assurance assurance) {
		super(assurance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return assurance.cout()+200;
	}

}
