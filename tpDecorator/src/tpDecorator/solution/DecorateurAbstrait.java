package tpDecorator.solution;

public abstract class DecorateurAbstrait extends Assurance {
	Assurance assurance;

	public DecorateurAbstrait(Assurance assurance) {
		super();
		this.assurance = assurance;
	}
	
}
