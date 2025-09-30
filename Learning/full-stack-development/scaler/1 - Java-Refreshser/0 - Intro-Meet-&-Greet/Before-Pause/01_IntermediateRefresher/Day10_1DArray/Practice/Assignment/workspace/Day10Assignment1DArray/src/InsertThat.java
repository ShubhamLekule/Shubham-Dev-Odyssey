//Problem Description
//
//Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X. X is based on 1-based indexing
//
//Note: When an element is inserted at position X, all elements that were already present at position >= X, gets shifted to one position right, not replaced.
//
//Problem Constraints
//
//1 <= N <= 100
//
//1 <= A[i] <= 1000
//
//1 <= X <= N
//
//1 <= Y <= 1000
//
//Input Format
//
//First line is N which represents number of elements.
//
//Second line contains N space separated integers.
//
//Third line is X position where Y has to be inserted.
//
//Fourth line is Y which is the value to be inserted.
//
//Output Format
//
//N+1 space separated integers of the input array after inserting the element at required position.
//
//Example Input
//
//Input 1:
//
//5
//
//2 3 1 4 2
//
//3
//
//5
//
//Example Output
//
//Output 1:
//
//2 3 5 1 4 2
//
//Example Explanation
//
//Explanation 1:
//
//Clearly after inserting 5 at 3rd position, new array is 2 3 5 1 4 2.
import java.util.Scanner;
public class InsertThat {
	
	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int N=234;
	        int[] arr= {958,645,287,77,836,854,788,109,417,241,77,15,325,529,969,400,977,660,991,347,683,279,903,408,745,605,154,678,619,314,912,928,310,550,357,145,755,144,254,171,736,682,537,60,211,505,811,539,517,801,238,199,431,492,959,528,96,112,205,66,425,468,346,87,370,702,231,124,845,836,647,580,518,535,992,80,392,802,618,908,955,855,458,385,699,416,264,794,879,821,212,304,640,557,390,9,258,972,485,102,808,131,33,325,17,24,404,408,178,373,315,484,580,125,868,278,892,484,423,771,304,634,426,943,190,167,304,799,138,788,252,945,270,285,621,286,660,24,46,189,749,712,672,328,836,892,957,728,375,379,498,30,365,275,972,554,441,627,705,578,414,956,523,35,592,495,673,604,519,718,792,619,429,816,946,265,707,902,344,433,632,193,462,996,467,785,902,907,412,606,484,177,561,358,564,505,853,236,108,723,305,251,341,733,66,638,349,772,891,44,556,522,236,369,518,54,154,771,960,917,376,796,445,288,505,360,792,709,947,251,431,251,502,123};
	        int[] arr2=new int[N+1];

//	        for(byte i=0;i<N;i++)
//	        arr[i]=sc.nextShort();

	        int X=222;
	        int Y=567;

	        
	        for(int i=0;i<N;i++){
	            if(i<X-1){
	            	
	                arr2[i]=arr[i];
	            }else if(i==X-1){
	                arr2[X-1]=Y;
	                arr2[i+1]=arr[i];
	            }else{
	                arr2[i+1]=arr[i];
	            }
	        }

	        for(int i=0;i<N+1;i++) System.out.print(arr2[i]+" ");

	}

}
