package DP_ChainResp_Observer;

public abstract class Observable {
	protected Observer observer;

	public void approuver() {
		observer.approuverBudget(this);
	}
	
	public void soustraire() {
		observer.soustraireMontant(this);
	}

}
