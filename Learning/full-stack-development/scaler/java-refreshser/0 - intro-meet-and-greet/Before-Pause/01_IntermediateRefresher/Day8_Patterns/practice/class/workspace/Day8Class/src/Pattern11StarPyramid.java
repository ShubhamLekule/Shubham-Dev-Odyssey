import java.util.Scanner;

public class Pattern11StarPyramid {

	public static void main(String[] args) {
		/*
		 * 		row	space1 star	space2 N=4
		 * 		1	3		1	3
		 * 		2	2		3	2
		 * 		3	1		5	1
		 * 		4	0		7	0
		 * 
		 * 		space1=space2=N-row
		 * 		star=2*row-1
		 */
		int N=new Scanner(System.in).nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N-i;j++)System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)System.out.print("*");
			for(int j=1;j<=N-i;j++)System.out.print(" ");
			System.out.println();
		}
	}

}
