package siddu;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		//check Given String is Polyndrome or not
		
		//example 13331----yes
		//level-----yes
		
		
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter data");
		String data=Sc.next();
		char ch;
		String newStr="";
		for(int i=data.length()-1;i>=0;i--) {
		   ch=data.charAt(i);
		   newStr=newStr +ch;
		}
		System.out.println("data from keyboard---->"+data);
		System.out.println("new Str---->"+newStr);
		if(data.contentEquals(newStr)==true) {
			System.out.println("polyndrome");
		}
		else {
			Sc.close();
		}
	}
}