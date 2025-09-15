import java.util.Scanner;
public class Pattern3NMRectangle {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int N=ip.nextInt();
		int M=ip.nextInt();
		for(int j=1;j<=N;j++) {
			for(int k=1;k<=M;k++)System.out.print("*");
			System.out.println();
		}

	}

}
