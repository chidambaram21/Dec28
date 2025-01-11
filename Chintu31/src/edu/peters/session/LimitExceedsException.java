package edu.peters.session;

public class LimitExceedsException extends Exception {
	
	
	String error;

	public LimitExceedsException(String error) {
		super();
		this.error = error;
	}

	@Override
	public String toString() {
		return "LimitExceedsException [error=" + error + "]";
	}
	
	
}

