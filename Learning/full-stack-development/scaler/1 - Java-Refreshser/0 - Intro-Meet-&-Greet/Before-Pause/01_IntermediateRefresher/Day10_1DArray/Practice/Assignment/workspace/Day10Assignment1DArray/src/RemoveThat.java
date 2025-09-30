//Problem Description
//Write a program to input N numbers array, A from the user and an integer X and print the array by deleting element at specified position X.
//
//Note: The first element is located at position 1, the second element is located at position 2, and so on.
//
//
//Problem Constraints
//2 <= N <= 100
//1 <= A[i] <= 1000
//1 <= X <= N
//
//
//Input Format
//First line is N which means number of elements.
//Second line contains N space separated integers.
//Third line is X position which has to be deleted.
//
//
//Output Format
//N-1 space separated integers of the input array after deleting the element at required position.
//
//
//Example Input
//Input 1:
//5
//2 3 1 4 2
//3
//Input 2:
//2
//4 5
//2
//
//
//Example Output
//Output 1:
//2 3 4 2
//Output 2:
//4
//
//
//Example Explanation
//Explanation 1:
//Clearly after removing the element at position 3 (2 3 1 4 2), the remaining array is 2 3 4 2.
//Explanation 2:
//After removing the element at position 2 (4 5), the remaining array is 4.
import java.util.Scanner;
public class RemoveThat {
	public static int[] removeThat(int[] arr,int pos){
        int[] newArr=new int[arr.length-1];
        for(int i=0;i<(arr.length-1);i++){
            if(i<pos){
                newArr[i]=arr[i];
            }else if(i>=pos){
                newArr[i]=arr[i+1];
            }
        }
        return newArr;
    }
	public static void main(String[] args) {
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int[] newArr=removeThat(arr,sc.nextInt()-1);

        for(int i=0;i<N-1;i++) System.out.print(newArr[i]+" ");

	}

}
