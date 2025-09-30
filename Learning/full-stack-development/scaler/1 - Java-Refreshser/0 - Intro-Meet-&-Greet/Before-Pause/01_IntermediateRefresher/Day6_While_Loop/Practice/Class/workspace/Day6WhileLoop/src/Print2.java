/*
 * Q2: Given an integer N as input 
 * print from N to 1
 * 
 * Input:4
 * Output: 4 3 2 1
 */
import java.util.Scanner;
public class Print2 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	int N=new Scanner(System.in).nextInt();	
	int count=N;
	while(count>=1) {
		System.out.print(count+" ");
		count--;
	}
}
}