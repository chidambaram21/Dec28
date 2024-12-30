package siddu;
public class Program3 {
	public static void main(String[] args) {
		/*
		 *  ******************************
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  *                            *
		 *  ******************************
		 *  
		 */
		for(int rows=1;rows<=50;rows++) {
			System.out.print("\t");
			if(rows==1||rows==50) {
				for(int cols=1;cols<35;cols++) {
					System.out.print("*");
				}
			}
			else {
				for(int cols=1;cols<=35;cols++) {
					if(cols==1||cols==35) {
						System.out.print("*");
				}
				else {
					System.out.print(" ");
					}
				}
			}
		System.out.println();
		}
	}
}