package DP_ChainResp_Observer;

public abstract class Handler {
	
	protected Handler nextHandler;
	protected Demande demande;
	
	abstract void handleRequest();
	

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	
	
}
