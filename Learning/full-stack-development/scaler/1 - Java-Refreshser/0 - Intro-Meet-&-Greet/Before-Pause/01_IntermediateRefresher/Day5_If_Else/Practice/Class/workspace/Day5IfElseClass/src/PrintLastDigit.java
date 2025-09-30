/*
 * Q5: Given an integer as input, print its last digit
 * 
 * Input: 73
 * Output:3
 * 
 * Input: 651
 * Output:1
 * 
 */
import java.util.Scanner;
public class PrintLastDigit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(new Scanner(System.in).nextInt()%10);

	}

}
