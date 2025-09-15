import java.util.Scanner;
public class Pattern4StaircasePattern {

	public static void main(String[] args) {
		int i=new Scanner(System.in).nextInt();
		for(int j=1;j<=i;j++) {
			for(int k=1;k<=j;k++)System.out.print("*");
			System.out.println();
		}

	}

}
