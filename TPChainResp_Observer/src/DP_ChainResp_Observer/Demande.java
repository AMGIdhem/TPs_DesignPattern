package DP_ChainResp_Observer;


public class Demande extends Observable {
	double amount;
	double departementBudget;
	
	public Demande(Observer obs) {
		this.observer=obs;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDepartementBudget() {
		return departementBudget;
	}
	public void setDepartementBudget(double departementBudget) {
		this.departementBudget = departementBudget;
	}
	
	
}
