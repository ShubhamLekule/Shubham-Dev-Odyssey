//Problem Description
//Implement a program that takes two positive integers A and B in the input and prints their LCM.
//
//Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B). And the LCM is the smallest or least positive integer that is divisible by both A and B.
//
//
//
//Problem Constraints
//1 <= A,B <= 200
//
//
//Input Format
//Two space separated integers A and B in the input.
//
//
//Output Format
//Output a single integer that is the LCM of A and B.
//
//
//Example Input
//Input 1:
//5 10
//Input 2:
//
//2 3
//
//
//Example Output
//Output 1:
//10
//Output 2:
//
//6
//
//
//Example Explanation
//Explanation 1:
//LCM(5,10)=10
//Explanation 2:
//
//LCM(2,3)=6
import java.util.Scanner;
public class LCMEasy {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        short A=sc.nextShort(),B=sc.nextShort();
//        int lcm=A>B?A:B;
//        for(int i=lcm;i<=A*B;i++){
//            if(i%A==0 && i%B==0){
//            System.out.print(i);
//            break;
//            }
//        }
        for(int i=A>B?A:B;i<=A*B;i=i+(A>B?A:B)){
            if(i%A==0 && i%B==0){
            System.out.print(i);
            break;
            }
        }

	}

}
