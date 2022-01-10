package tpDecorator.solution;

public class DommageCollision extends DecorateurAbstrait {

	public DommageCollision(Assurance assurance) {
		super(assurance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return assurance.cout()+200;
	}

}
