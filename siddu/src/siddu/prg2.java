package siddu;

public class prg2 {

	public static void main(String[] args) {
      int amount=15,n10=0,c5=0,c2=0,c1=0;
      System.out.println("given currency....>"+amount);
      if (amount>10) {
    	  n10=amount/10;
    	  amount=amount-(n10*n10);
      }
      if(amount>=5) {
    	  c5=amount/5;
    	  amount=amount-(c5*5);
      }
      if(amount>=2) {
    	  c2=amount/2;//3/2--1
    	  amount=amount-(c2*2);
      }
      if(amount>0) {
    	  c1=1;
      }
      System.out.println("10note....>"+n10);
      System.out.println("5coins....>"+c5);
      System.out.println("2coins....>"+c2);
      System.out.println("1coins....>"+c1);
    	  
      }

	}


