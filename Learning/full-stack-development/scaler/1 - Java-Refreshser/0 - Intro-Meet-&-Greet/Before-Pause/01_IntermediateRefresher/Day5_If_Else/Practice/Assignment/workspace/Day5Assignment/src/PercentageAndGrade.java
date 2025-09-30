//Problem Description
//Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.
//
//If percentage >= 90% : Grade A
//If percentage >= 80% but <90 : Grade B
//If percentage >= 70% but <80: Grade C
//If percentage >= 60% but <70: Grade D
//If percentage >= 40% but <60: Grade E
//If percentage < 40%: Grade F
//
//
//NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.
//
//
//Input Format
//There will be five lines of inputs as following:
//The five lines contain the 5 subject marks of the student in numerical format.
//
//
//Output Format
//The first line indicates the percentage in integer format.
//The next line displays the grade in string format.
//
//
//Example Input
//50
//60
//70
//80
//90
//
//
//Example Output
//70
//C
import java.util.Scanner;
public class PercentageAndGrade {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner ip=new Scanner(System.in);
        int A=ip.nextInt();
        int B=ip.nextInt();
        int C=ip.nextInt();
        int D=ip.nextInt();
        int E=ip.nextInt();
        int result=(A+B+C+D+E)/5;
        System.out.println(result);
        if(result>=90)System.out.print("A");
        else if(result>=80 && result <90)System.out.print("B");
        else if(result>=70 && result <80)System.out.print("C");
        else if(result>=60 && result <70)System.out.print("D");
        else if(result>=40 && result <60)System.out.print("E");
        else System.out.print("F");

	}

}
