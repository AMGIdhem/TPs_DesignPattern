package DP_ChainResp_Observer;

public class Budget implements Observer {
	double budgetBloque;


	@Override
	public void approuverBudget(Observable observable) {
		Demande demande = (Demande) observable;
		if(demande.amount<=demande.departementBudget) {
			System.out.println("verification avec succes, le budget couvre amount de la demande");
			this.budgetBloque = demande.amount;
		} else {
			System.out.println("verification echouee, pas assez de budget pour couvrir amount de la demande");
		}

	}

	@Override
	public double soustraireMontant(Observable observable) {
		Demande demande = (Demande) observable;
		demande.departementBudget = demande.departementBudget - this.budgetBloque;
		this.budgetBloque = 0;
		return demande.departementBudget;
	}



}
