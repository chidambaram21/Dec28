package chintu28;

class Bank1 {
	int balance;
	void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("successfully deposited.....amount..." + amt);
	}
	void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println(" successfully withdrawn.....amount..." + amt);
	}
	
	void checkBalance() {
		System.out.println(" avl balance....." + this.balance);
	}

	
}
class CanaraBank2 extends Bank {
	public CanaraBank2(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt < 50000) {
			this.balance = this.balance + amt;
			System.out.println("From CanaraBank successfully deposited.....amount..." + amt);
		} else {
			System.out.println("FRom CanaraBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 50000) {
			this.balance = this.balance - amt;
			System.out.println("From CanaraBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom CanaraBank Day Limit exceeds");
		}
	}
	void checkBalance() {
		System.out.println("FROm CanaraBank avl balance....." + this.balance);
	}
}
class KotakBank2 extends Bank1 {
	public KotakBank2 (int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt < 200000) {
			this.balance = this.balance + amt;
			System.out.println("From KotakBank successfully deposited.....amount..." + amt);
		} else {
			System.out.println("FRom KotakBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 200000) {
			this.balance = this.balance - amt;
			System.out.println("From KotakBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom KotakBank Day Limit exceeds");
		}
	}
	void checkBalance() {
		System.out.println("From KotakBank avl balance....." + this.balance);
	}
}

class YesBank2  extends Bank {
	public YesBank2(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt < 500000) {
			this.balance = this.balance + amt;
			System.out.println("From YesBank successfully deposited.....amount..." + amt);

		} else {
			System.out.println("FRom YesBank Day Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt < 500000) {
			this.balance = this.balance - amt;
			System.out.println("From YesBank successfully withdrawn.....amount..." + amt);
		} else {
			System.out.println("FRom YesBank Day Limit exceeds");
		}
	}
	void checkBalance() {
		System.out.println("FROm YesBank1 avl balance....." + this.balance);
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		
		Bank bank= null;
	
		bank = new CanaraBank(10000);
		
		
		bank.checkBalance();
		bank.withDraw(2300);
		bank.deposit(35700);
		bank.checkBalance();
		
		
		bank =  new KotakBank(75000);
		bank.checkBalance();
		bank.withDraw(2300);
		bank.deposit(35700);
		bank.checkBalance();
		
		bank = new YesBank(85000);
		bank.checkBalance();
		bank.withDraw(2300);
		bank.deposit(35700);
		bank.checkBalance();
		
		
		
		
		
		
		
		
		
		
	}

}