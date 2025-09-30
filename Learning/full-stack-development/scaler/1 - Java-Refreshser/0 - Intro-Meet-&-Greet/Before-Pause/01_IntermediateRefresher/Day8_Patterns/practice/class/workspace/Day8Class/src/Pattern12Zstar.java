import java.util.Scanner;
public class Pattern12Zstar {

	public static void main(String[] args) {
		int N=new Scanner(System.in).nextInt();
		for(int i=N;i>=1;i--) {
			for(int j=1;j<=N+1;j++) {
				if(i==1||i==N)System.out.print("*");
				else System.out.print((j==i)?"*":" ");
			}
			System.out.println();
		}

	}

}
