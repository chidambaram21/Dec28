package siddu;

public class prg5 {
	public static void main(String[] args) {
		int n=7098,rem,nn=0;
		//8
		//9
		//0
		//7
		//reverse number
		//7098
		//7*10+0---70 *10+9----709*10+8----7098
		while(n!=0) {
			rem=n%10;
			nn=nn * 10+rem;
			System.out.println(rem);
			n=n/10;
		}
		System.out.println("reverse number--->"+nn);
	}
}
	