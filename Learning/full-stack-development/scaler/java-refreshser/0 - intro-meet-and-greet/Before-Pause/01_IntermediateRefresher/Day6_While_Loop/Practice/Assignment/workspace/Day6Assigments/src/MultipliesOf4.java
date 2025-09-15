//Problem Description
//Given an integer input N, print all multiples of 4 less than or equal to N.
//
//Problem Constraints
//1 <= N <= 10000
//
//
//Input Format
//Single line containing an integer N.
//
//
//Output Format
//Space separated integers representing multiples of 4 less than or equal to N.
//
//
//Example Input
//22
//
//
//Example Output
//4 8 12 16 20
//
//
//Example Explanation
//1 * 4 = 4
//2 * 4 = 8
//3 * 4 = 12
//4 * 4 = 16
//5 * 4 = 20
//
//All are multiples of 4 less than 22

import java.util.Scanner;
public class MultipliesOf4 {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int N=ip.nextInt();
        int i=4;
            while(i<=N){
                if(i%4==0){
                    System.out.print(i+" ");
                }
                i+=4;
            }

	}

}
