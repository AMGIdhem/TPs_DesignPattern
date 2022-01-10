package tpDecorator.solution;

public class BrisGlace extends DecorateurAbstrait {

	public BrisGlace(Assurance assurance) {
		super(assurance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return assurance.cout()+200;
	}
	
}
