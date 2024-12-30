package siddu;
import java.util.Scanner;
public class Program7 {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter 2 names");
		String name1=Sc.next();
		String name2=Sc.next();
		System.out.println("Before Swapping");
		System.out.println("name1------>+name1");
		System.out.println("name2------>+name2");
		name1 = name1+name2;//---name1.len name2.len
		name2 = name1.substring(0, name1.length()-name2.length());
		name1 = name1.substring(name1.length());
		
		System.out.println("After Swapping");
		System.out.println("name1-------->"+name1);
		System.out.println("name2-------->"+name2);
		{
			
		}

	}

}
