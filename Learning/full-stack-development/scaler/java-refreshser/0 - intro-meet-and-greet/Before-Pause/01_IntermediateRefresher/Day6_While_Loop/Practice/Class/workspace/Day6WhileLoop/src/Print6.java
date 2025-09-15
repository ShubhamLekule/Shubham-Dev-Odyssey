/*
 * Q6: Given an integer N as input 
 * print square of number from 1 to N
 * 
 * Input:4
 * Output: 1 4 9 16
 */
import java.util.Scanner;
public class Print6 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	int N=new Scanner(System.in).nextInt();	
	int count=1;
	while(count<=N) {
		System.out.print(count*count+" ");
		count++;
	}
}
}