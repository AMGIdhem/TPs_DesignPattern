package tpDecorator.solution;

public class ResponsabiliteCivile extends Assurance{

	private double frais;
	
	@Override
	public double cout() {
		frais = 1000;
		return frais;
	}

}
