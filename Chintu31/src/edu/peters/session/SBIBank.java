package edu.peters.session;

public class SBIBank implements Bank{
	
	int balance;
	
	
	public SBIBank(int balance) {
		super();
		this.balance=balance;
	
	}

	public void withDraw(int amt) {
	try {
		if(amt > this.balance) {
			System.out.println("amt "+amt+" trying to withdraw...");
			throw new InSufficientBalanceException();
		}
		else {
			System.out.println("successfully withdrawn amount...."+amt);
			this.balance=this.balance-amt;
	}
	}catch(InSufficientBalanceException e) {
		System.out.println("error occured during with draw...");
		e.printStackTrace();
	}
	}
	public void deposit(int amt) {
		try {
			if(amt >50000) {
				System.out.println("amt "+amt+" trying to withdraw...");
				throw new LimitExceedsException("more than 50k not possible");
			}
			else {
				System.out.println("successfully deposit amount...."+amt);
				this.balance=this.balance-amt;
		}
		}catch(LimitExceedsException e) {
			System.out.println("error occured during with draw...");
			e.printStackTrace();

		}
	}
}
