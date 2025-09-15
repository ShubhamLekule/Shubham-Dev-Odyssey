/*
 * Q2: Max of two
 * 
 * Given two integers A and B as input
 * print larger one
 * 
 * Input: A=4, B=6
 * Output: 6 is larger
 * 
 * Input: A=9, B=6
 * Output: 9 is larger
 * 
 * Input: A=6, B=6
 * Output: Both are equal
 * */
import java.util.Scanner;
public class MaxOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		if(A>B) {
			System.out.println(A+" is larger");
		}else if(B>A) {
			System.out.println(B+" is larger");
		}else {
			System.out.println("Both are equal");
		}

	}

}
