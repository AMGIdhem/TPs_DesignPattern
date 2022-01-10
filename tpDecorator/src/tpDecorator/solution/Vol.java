package tpDecorator.solution;

public class Vol extends DecorateurAbstrait {

	public Vol(Assurance assurance) {
		super(assurance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return assurance.cout()+200;
	}

}
