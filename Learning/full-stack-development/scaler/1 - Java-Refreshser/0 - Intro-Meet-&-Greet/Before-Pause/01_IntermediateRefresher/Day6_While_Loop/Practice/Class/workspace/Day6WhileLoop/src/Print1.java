/*
 * Q1: Given an integer N as input 
 * print from 1 to N
 * 
 * Input:4
 * Output: 1 2 3 4
 */
import java.util.Scanner;
public class Print1 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	int N=new Scanner(System.in).nextInt();	
	int count=1;
	while(count<=N) {
		System.out.print(count+" ");
		count++;
	}
}
}
