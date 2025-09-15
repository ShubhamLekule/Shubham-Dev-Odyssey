//Problem Description:
//
//Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.
//
//Input Format:
//
//The only argument is the given list of elements
//Output Format:
//
//Return a list consisiting of the elements that are divisible by 5 and 7 from the given list.
//Sample Input:
//
//[23, 34, 25, 35, 66, 70, 14]
//Sample Output:
//
//[35, 70]
//Sample explanation:
//
//Only 35 and 70 are divisible by 5 and 7 from the list [23,34,25,35,66,70,14] 
//therefore the list consisting of only these two elements is returned.
import java.util.ArrayList;
public class DividedBy5and7 {
	public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
	    ArrayList<Integer> res=new ArrayList<Integer>();
	    for(int i=0;i<arr.size();i++)
	    if(arr.get(i)%5==0 && arr.get(i)%7==0)
	        res.add(arr.get(i));
	        return res;
	}
	public static void main(String[] args) {
		//call solve


}

}
