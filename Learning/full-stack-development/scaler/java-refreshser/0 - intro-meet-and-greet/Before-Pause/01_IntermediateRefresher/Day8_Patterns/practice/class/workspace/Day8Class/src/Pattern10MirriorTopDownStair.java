import java.util.Scanner;
public class Pattern10MirriorTopDownStair {

	public static void main(String[] args) {
		
		
		/*
		 * 	rightstar	space	leftstar	row		N=4
		 * 	4			0		4			1		
		 * 	3			2		3			2		
		 * 	2			4		2			3		
		 * 	1			6		1			4		
		 * 
		 * rightstar=N+1-row
		 * leftstar=N+1-row
		 * space=2*row-2
		 * 
		 */
		
		int N=new Scanner(System.in).nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N+1-i;j++)System.out.print("*"); 
			for(int j=1;j<=2*i-2;j++)System.out.print(" "); 
			for(int j=1;j<=N+1-i;j++)System.out.print("*");
			System.out.println();
		}
	}
		
		

	}


