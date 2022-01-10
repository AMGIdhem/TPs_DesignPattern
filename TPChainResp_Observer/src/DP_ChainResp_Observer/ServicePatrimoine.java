package DP_ChainResp_Observer;

public class ServicePatrimoine extends Handler {
	
	public ServicePatrimoine(Demande demande) {
		this.demande = demande;
	}

	@Override
	void handleRequest() {
		this.demande.soustraire();
		
	}

}
