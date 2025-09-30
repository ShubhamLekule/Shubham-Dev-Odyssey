/*
 * Q6: Given an integer N as input
 * print perfect square till N
 * 
 * perfect square -> An integer whose square root is an integer
 * for eg 4(2*2), 9(3*3), 100(10*10) ,1(1*1)
 * 
 * Input: 30
 * Output: 1 4 9 16 25
 * 
 */
import java.util.Scanner;
public class Print9 {

	public static void main(String[] args) {
		int i=1;
		@SuppressWarnings("resource")
		int num=new Scanner(System.in).nextInt();
		while(i*i<=num) {
			System.out.print(i*i+" ");
			i++;
		}

	}

}
