package edu.peters.session;


interface Bank{
	
	void withDraw(int amt) throws InSufficientBalanceException;
	void deposit (int amt) throws LimitExceedsException;
}

public class Demo6 {

static void m1() throws Exception{
		
		System.out.println("hello1");
		System.out.println("hello2");
		
		if(1==1) throw new Exception("Peter college Exception");
				
		System.out.println("hello3");
		System.out.println("hello4");
		System.out.println("hello5");

	}
	public static void main(String[] args) throws Exception {
           
		
		//throw throw
		
		m1();
		
	}

}
