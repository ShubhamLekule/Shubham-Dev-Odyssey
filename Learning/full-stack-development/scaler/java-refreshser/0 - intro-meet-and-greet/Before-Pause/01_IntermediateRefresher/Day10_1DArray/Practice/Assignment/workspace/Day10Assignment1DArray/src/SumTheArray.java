//Problem Description
//Write a program to print sum of elements of the input array A of size N.
//
//Note: User is supposed to write a program from scratch to add the elements of the input array and print the result.
//
//
//Problem Constraints
//1 <= N <= 1000
//
//1 <= A <= 1000
//
//
//
//Input Format
//- The first integer N denotes the number of integers in the array.
//- The next N integers denotes the element of the array A.
//
//
//
//Output Format
//A single integer containing sum of elements from the input array.
//
//
//
//Example Input
//Input 1:
//
//
//5 1 2 3 4 5
//Input 2:
//
//4 10 50 40 80
//
//
//Example Output
//Output 1:
//
//15
//Output 2:
//
//180
//
//
//Example Explanation
//Input-1:
//N = 5 , A = [1, 2, 3, 4, 5]
//here the first integer is the size of A and the remaining elements are [1, 2, 3, 4, 5]
//which all sum to 15 
//Input-2:
//N = 4 , A = [10, 50, 40, 80]
//here the first integer is the size of A and the remaining elements are [10, 50, 40, 80]
//which all sum to 180
import java.util.Scanner;
public class SumTheArray {
	public static int findSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum=sum+arr[i];
        return sum;
    }
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++) arr[i]=sc.nextInt();
        System.out.print(findSum(arr));

	}

}
