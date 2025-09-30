
import java.util.Scanner;
public class Pattern8HolloTopDownStair {

	public static void main(String[] args) {
//		int N=new Scanner(System.in).nextInt();
//		for(int i=1;i<=N;i++) {
//			for(int j=1;j<=N+2-i;j++) System.out.print((j==1||j==N+2-i)?"*":" ");
//			System.out.println();
//		}
		
		/*
		 * 	row		space		N=4
		 * 	1		3			1+3=N
		 * 	2		2			2+2=N
		 * 	3		1			3+1=N
		 * 	4		0			4+0=N
		 * 
		 * space=N-row
		 * 
		 */
		
		int N=new Scanner(System.in).nextInt();
		for(int i=1;i<=N;i++) {
			System.out.print("*");
			for(int j=1;j<=N-i;j++)
				System.out.print(" ");
				System.out.println("*");
		}

	}

}
