package edu.peters.session;

class Emp{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
public class Demo4 {

	public static void main(String[] args) {
	
		int[] num = {1,2,3};
		Emp emp1=null;
		
		try {
			System.out.println(100/2);
			System.out.println(num[10]);
			System.out.println(emp1.getName());
				
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		//catch(ArrayIndexOutOfBoundsException e2) {
			//e2.printStackTrace();
		//}
	    catch(NullPointerException e3) {
			e3.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("super class exception got called....");
			e.printStackTrace();
			
		}
		
		System.out.println("hello");
		System.out.println("welcome");
		System.out.println("Program Ends...");
		
	}

}
	
	
	

