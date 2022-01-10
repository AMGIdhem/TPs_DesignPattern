package DP_ChainResp_Observer;

public class Main {

	public static void main(String[] args) {
		Observer budget = new Budget();
		Demande demande = new Demande(budget);
		demande.setAmount(500);
		demande.setDepartementBudget(800);
		
		Handler serviceComptable = new ServiceComptable(demande);
		Handler servicePatrimoine = new ServicePatrimoine(demande);
		serviceComptable.setNextHandler(servicePatrimoine);
		
		serviceComptable.handleRequest();
		
		System.out.println("le montant du departement est : " + demande.departementBudget);

	}

}
