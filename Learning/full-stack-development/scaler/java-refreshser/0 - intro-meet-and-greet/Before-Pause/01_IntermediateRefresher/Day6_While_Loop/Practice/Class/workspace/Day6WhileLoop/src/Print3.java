/*
 * Q3: Given an integer N as input 
 * print all odd values from 1 to N
 * 
 * Input:4
 * Output: 1 3 
 */
import java.util.Scanner;
public class Print3 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	int N=new Scanner(System.in).nextInt();	
	int count=1;
//	while(count<=N ) {
//		if(count%2==1)System.out.print(count+" ");
//		count++;
//	}
	while(count<=N) {
		System.out.print(count+" ");
		count+=2;
	}
}
}
