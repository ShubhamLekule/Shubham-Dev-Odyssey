//Problem Description
//Given an Array of integers A, every element in it is repeated twice except one, find that unique element.
//
//
//Problem Constraints
//1<= Length of array A <= 103
//0<= Ai <=1000
//
//
//Input Format
//First argument A is the given array.
//
//
//Output Format
//Return an Integer X, such that X occurs once in the A.
//
//
//Example Input
//Input 1:
//
//A = [1, 4, 3, 5, 2, 3, 5, 1, 4]
//Input 2:
//
//A = [9, 10, 7, 10, 9, 1, 5, 1, 5]
//
//
//Example Output
//Output 1:
//
//2
//Output 2:
//
//7
//
//
//Example Explanation
//In Example 1:
//All the elements except for 2 occurs twice in the array. Hence 2 is the unique element.
import java.util.ArrayList;
import java.util.Arrays;
public class UniqueElement {
	public static int solve(ArrayList<Integer> A) {
        int unique=0;
        for(int i=0;i<A.size();i++){
            unique=A.get(i);
            int count=0;
            for(int j=0;j<A.size();j++){
               if(unique==A.get(j))
               count++;
            }
            if(count<=1)
            return unique;
        }
        return unique;
    }

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(103,131,82,140,119,69,114,77,136,52,97,63,123,110,36,76,124,55,48,9,88,136,33,34,33,4,112,39,70,50,129,135,201,78,29,20,13,2,76,51,31,35,87,84,149,81,129,10,90,91,100,17,11,142,99,8,61,99,120,23,42,150,24,52,148,48,107,101,86,133,36,75,82,75,126,147,106,95,51,22,96,27,37,27,137,108,123,104,73,74,135,133,47,74,77,141,59,143,139,147,146,9,46,64,128,102,144,138,90,111,115,6,145,53,89,30,1,31,118,18,26,71,122,79,68,15,89,60,25,1,106,4,94,60,122,65,117,84,134,119,69,37,127,109,108,107,35,56,40,93,26,44,109,68,132,130,125,148,18,92,54,118,64,16,2,128,67,117,10,101,88,5,80,42,141,57,5,32,21,53,30,145,116,73,45,62,139,72,44,138,15,16,85,78,112,57,71,40,38,111,120,28,72,98,66,66,115,70,61,55,7,81,63,29,38,96,126,86,137,100,21,150,103,124,146,134,50,93,105,125,121,8,14,102,110,116,22,49,12,98,65,6,58,83,17,131,46,19,79,59,113,104,11,54,32,142,39,49,92,80,67,121,85,34,91,12,87,3,23,41,95,24,132,105,83,28,56,25,140,114,19,41,127,113,3,58,43,43,14,7,45,130,94,143,47,149,13,144,20,62,97));
		System.out.println(solve(arr));


}

}
