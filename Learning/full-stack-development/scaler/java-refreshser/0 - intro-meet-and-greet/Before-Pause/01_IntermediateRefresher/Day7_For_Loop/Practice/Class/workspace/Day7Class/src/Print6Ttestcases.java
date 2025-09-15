/*
 * T : Number of input num
 * N: Number
 * 
 * print last digit of number
 */
import java.util.Scanner;
public class Print6Ttestcases {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++) {
			int N=sc.nextInt();
			System.out.println(N%10);
		}

	}

}
