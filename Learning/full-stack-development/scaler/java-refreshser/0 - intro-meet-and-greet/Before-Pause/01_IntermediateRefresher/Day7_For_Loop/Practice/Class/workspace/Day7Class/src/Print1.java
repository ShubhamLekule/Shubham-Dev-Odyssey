/*
 * print 1 to N
 */
import java.util.Scanner;
public class Print1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int N=new Scanner(System.in).nextInt();
		for(int i=1;i<=N;i++) {
			System.out.print(i+" ");
		}

	}

}
