/*
 * Q4: Given an integer N as input 
 * print all even values from 1 to N
 * 
 * Input:4
 * Output: 2 4
 */
import java.util.Scanner;
public class Print4 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	int N=new Scanner(System.in).nextInt();	
	int count=2;
	while(count<=N) {
		System.out.print(count+" ");
		count+=2;
	}
}
}