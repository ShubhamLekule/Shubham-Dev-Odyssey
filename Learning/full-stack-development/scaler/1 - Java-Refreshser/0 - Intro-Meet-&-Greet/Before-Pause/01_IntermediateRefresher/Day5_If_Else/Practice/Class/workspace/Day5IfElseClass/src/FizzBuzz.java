/*
 * Q7: FizzBuzz [Amazon]
 * 
 * Given an integer A as input,
 * If it is multiple of 3, print Fizz
 * If it is multiple of 5, print Buzz
 * If it is multiple of 3 & 5, print FizzBuzz
 * 
 * Input:6
 * Output:Fizz
 * 
 * Input:5
 * Output:Buzz
 * 
 * Input:30
 * Output:FizzBuzz
 * 
 * Input:13
 * Output:Arrr
 */
import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int A=new Scanner(System.in).nextInt();
		if(A%3==0 && A%5==0)System.out.println("FizzBuzz");
		else if(A%3==0)System.out.println("Fizz");
		else if(A%5==0)System.out.println("Buzz");
		else System.out.println("Arrrr");

	}

}
