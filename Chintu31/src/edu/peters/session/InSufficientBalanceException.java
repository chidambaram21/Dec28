package edu.peters.session;

public class InSufficientBalanceException extends Exception {

	String message;
		
		
		public InSufficientBalanceException() {
			super();
			this.message=message;
		}


		@Override
		public String toString() {
			return "InSufficientBalanceException [message=" + message + "]";
		
	
	}
		

}
