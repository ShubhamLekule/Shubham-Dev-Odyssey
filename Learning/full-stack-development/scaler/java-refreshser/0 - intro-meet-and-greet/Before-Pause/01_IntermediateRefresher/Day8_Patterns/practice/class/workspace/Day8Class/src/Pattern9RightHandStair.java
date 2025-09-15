import java.util.Scanner;
public class Pattern9RightHandStair {

	public static void main(String[] args) {
//		int N=new Scanner(System.in).nextInt();
//		for(int i=1;i<=N;i++) {
//			for(int j=1;j<=N;j++) {
//				System.out.print((j<=N-i)?" ":"*");
//			}
//			System.out.println();
//		}
		
		/*
		 * row  space star	N=4
		 * 1	3		1
		 * 2	2		2
		 * 3	1		3
		 * 4	0		4
		 * 
		 * star==row
		 * row+space=N
		 * space=N-row
		 */
		
		int N=new Scanner(System.in).nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
