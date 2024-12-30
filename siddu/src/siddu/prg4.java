package siddu;

import java.util.Scanner;

public class prg4{
	public static void main(String[] args) {
		Scanner xy =new Scanner(System.in);
		System.out.println("enter char value");
		char ch=xy.next().charAt(0);
		if ((ch>='a')&&(ch <='z')){
			System.out.println("Alphabet eh shivani");
		}
		else if ((ch>='A')&&(ch<='z')){
			System.out.println("Alphabet broo");
		}
		else {
			System.out.println("Alphabet kadh shivani");
		}
	}
}
