
import java.util.Scanner;
public class Pattern6HolloPattern {

	public static void main(String[] args) {
		//below working
//		int i=new Scanner(System.in).nextInt();
//		for(int j=1;j<=i;j++) {
//			for(int k=1;k<=i;k++)System.out.print((k==1||k==i)?"*":" ");
//			System.out.println();
//		}

		//optimize sol, but not for num 1 and 3 as this is hollo square pattern
		
		int N=new Scanner(System.in).nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.print("*");
			for(int j=1;j<=N-2;j++) System.out.print(" ");
			System.out.println("*");
		}
		
	}

}
