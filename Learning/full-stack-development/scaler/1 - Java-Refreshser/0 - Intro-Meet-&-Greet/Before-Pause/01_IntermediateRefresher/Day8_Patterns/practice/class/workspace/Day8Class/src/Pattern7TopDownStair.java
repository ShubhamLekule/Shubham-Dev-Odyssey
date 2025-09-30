
import java.util.Scanner;
public class Pattern7TopDownStair {

	public static void main(String[] args) {
//		int i=new Scanner(System.in).nextInt();
//		for(int j=i;j>=1;j--) {
//			for(int k=j;k>=1;k--)
//				System.out.print("*");
//			System.out.println();
//		}
		
		
/*
 * N= 4
 * 	row		star
 * 	1		4		N+1-row=4+1-1=4star
 * 	2		3		N+1-row=4+1-2=3star
 * 	3		2		N+1-row=4+1-3=2star
 * 	4		1		N+1-row=4+1-4=1star
 * by using above formula below sol
 */
		
		int N=new Scanner(System.in).nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N+1-i;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
