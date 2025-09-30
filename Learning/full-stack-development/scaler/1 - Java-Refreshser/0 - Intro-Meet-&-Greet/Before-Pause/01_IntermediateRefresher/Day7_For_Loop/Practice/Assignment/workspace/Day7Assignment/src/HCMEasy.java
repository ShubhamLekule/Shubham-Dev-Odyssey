//Problem Description
//Write a program to input two integers A & B from user and print their HCF.
//
//Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.
//
//
//
//Problem Constraints
//1 <= A,B <= 100000
//
//
//
//Input Format
//First line will contain 2 integers A and B
//
//
//
//Output Format
//An integer which is the HCF of A & B.
//
//
//
//Example Input
//Input 1:
//
//15 105 
//Input 2:
//
//24 36 
//
//
//Example Output
//Output 1:
//
//15
//Output 2:
//
//12
import java.util.Scanner;
public class HCMEasy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(),B=sc.nextInt();
//        int hcf=1;
//        int small=A>B?B:A;
//        for(int i=2;i<=small;i++){
//            if(A%i==0 && B%i==0)
//            hcf=i;
//        }
//        System.out.print(hcf);
        
        for(int hcf=A>B?B:A;hcf>=1;hcf--){
            if(A%hcf==0 && B%hcf==0){
            System.out.print(hcf);
            break;
            }
        }

	}

}
