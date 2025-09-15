//Problem Description
//You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.
//
//Even numbers are those numbers that are divisible by 2.
//
//
//
//Problem Constraints
//1 <= N <= 500
//
//
//
//Input Format
//First and only argument is an integer A.
//
//
//
//Output Format
//Return an integer denoting the sum of even numbers between [1, A] (both inclusive).
//
//
//
//Example Input
//Input 1:
//
// 5
//Input 2:
//
// 2
//
//
//Example Output
//Output 1:
//
// 6
//Output 2:
//
// 2
//
//
//Example Explanation
//Explanation 1:
//
// Even numbers between [1, 5] are (2, 4).
//Explanation 2:
//
// Even numbers between [1, 2] are (2)

import java.util.Scanner;

public class SumOfEven {
	public static int solve(int A) {
//        int sum=0;
//        for(int i=1;i<=A;i++){
//            if(i%2==0) sum=sum+i;
//        }
//        return sum;
		 if (A % 2 != 0) {
	            A--;
	        }
	        int sum = (A * (A + 2) ) / 4;
	        return sum;
    }
	public static void main(String[] args) {
		System.out.println(solve(new Scanner(System.in).nextInt()));

	}

}
