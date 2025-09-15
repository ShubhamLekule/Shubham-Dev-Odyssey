//Problem Description
//
//Write a program to print the input array A of size N in reverse order where you have to take integer N and further N elements as input from user.
//
//
//Problem Constraints
//
//1 <= N <= 1000
//1 <= A <= 1000
//Input Format
//
//A single line representing N followed by N integers of the array A
//
//Output Format
//
//A single line containing N space separated integers representing elements of the input array in reverse order.
//Note - Keep a space character (' ') at the end of the line.
//
//Example Input
//
//Input 1:
//
//5 1 2 3 4 5
//Input 2:
//
//4 10 50 40 80
//
//Example Output
//
//Output 1:
//
//5 4 3 2 1 
//Output 2:
//
//80 40 50 10 
import java.util.Scanner;
public class PrintInReverse {

	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=N-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

	}

}
