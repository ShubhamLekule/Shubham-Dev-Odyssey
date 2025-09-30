/*
 * Q1: Is person eligible for vote?
 * 
 * Given an integer age as input , print whether
 * the person is eligible to vote or not
 * 
 * Input: 20
 * Output: Eligible
 * 
 * Input: 14
 * Output: Not Eligible
 * 
 * */
import java.util.Scanner;
public class EligibleForVote {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		if(new Scanner(System.in).nextInt()>=18) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not Eligible");
		}

	}

}
