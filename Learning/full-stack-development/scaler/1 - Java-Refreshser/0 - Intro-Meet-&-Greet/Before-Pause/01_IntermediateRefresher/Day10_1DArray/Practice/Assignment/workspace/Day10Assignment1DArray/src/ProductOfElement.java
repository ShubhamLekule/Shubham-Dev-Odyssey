//Problem Description:
//
//Write a program that returns the product of all elements present in the array.
//
//Note: The list with elements is already passed as an argument to the function. User don't need to take any input. Just perform the task on the passed arguments and return the required result.
//
//Constraints:
//
//1 <= |A| <= 100
//1 <= A <= 100
//Note: It is guaranteed that the resultant product will be <= 1015
//Input Format:
//
//An integer array **A** as the function argument.
//Output Format:
//
//Product of elements in integer format
//Sample Input:
//
//A = [7, 9, 2, 51]
//Sample Output:
//
//6426
//Sample explanation:
//
//The product of all the elements is 7 * 9 * 2 * 51 = 6426 is returned.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ProductOfElement {
	public static long solve(ArrayList<Integer> arr) {
	    long product=1;
	    for(int elm:arr){
	        product=product*elm;
	    }
	    return product;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(7, 9, 2, 51));
		solve(arr);

	}

}
