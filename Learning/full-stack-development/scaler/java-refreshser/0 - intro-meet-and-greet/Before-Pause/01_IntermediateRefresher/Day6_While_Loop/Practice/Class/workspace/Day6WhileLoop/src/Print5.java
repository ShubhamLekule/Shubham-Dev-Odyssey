/*
 * Q5: Given an integer N as input 
 * print multiple of from 1 to N
 * 
 * Input:20
 * Output: 4 8 12 16 20
 */
import java.util.Scanner;
public class Print5 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	int N=new Scanner(System.in).nextInt();	
	int count=4;
	while(count<=N) {
		System.out.print(count+" ");
		count+=4;
	}
}
}