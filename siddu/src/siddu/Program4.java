package siddu;
public class Program4 {
	public static void main(String[] args) {
		/*
		 * 1
		 * 0 1
		 * 1 0 1
		 * 0 1 0 1
		 * 
		 */
		for (int r=1;r<=4;r++) {
			if(r%2==0) {
				//even
				for(int c=1,p=0;c<=r;c++) {
					System.out.print(p+" ");
					if(p==1) p=0;
					else p=1;
				}
			}
			else {
				//odd
				for(int c=1,p=1;c<=r;c++) {
					System.out.print(p+" ");//3 % 2-------1
					if(p==1) p=0;
					else p=1;
				}
			}//else
			System.out.println();
				}
	}
}
			

	

