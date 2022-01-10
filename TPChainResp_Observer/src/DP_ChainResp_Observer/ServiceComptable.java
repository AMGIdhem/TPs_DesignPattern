package DP_ChainResp_Observer;

public class ServiceComptable extends Handler {
	
	public ServiceComptable(Demande demande) {
		this.demande = demande;
	}

	@Override
	void handleRequest() {
		this.demande.approuver();
		this.nextHandler.handleRequest();
	}
	
	
	
}
