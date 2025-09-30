//Problem Description
//
//You are given a character string A having length N.
//
//The string consists of 2 types of characters:
//
//Alphabets : ['a'-'z', 'A'-'Z']
//Digits: ['0'-'9']
//You have to tell the count of characters of the maximum occuring character type.
//
//
//
//Problem Constraints
//
//1 <= N <= 105
//
//
//
//Input Format
//
//First and only argument is a character string A.
//
//
//
//Output Format
//
//Return an integer.
//
//
//
//Example Input
//
//Input 1:
//
// A = "HelloUser1"
//Input 2:
//
// A = "M1234"
//
//
//Example Output
//
//Output 1:
//
// 9 
//Output 2:
//
// 4 
//
//
//Example Explanation
//
//Explanation 1:
//
// Count of alphabets = 9(max)
// Count of digits = 1
//Explanation 2:
//
// Count of alphabets = 1
// Count of digits = 4(max)
public class DiverseCharacter {
	 public static int solve(final String A) {
	        int digitChar=0;
	        int alphabateChar=0;
	        for(int i=0;i<A.length();i++){
	            if(A.charAt(i)>='A' && A.charAt(i)<='Z' ||A.charAt(i)>='a' && A.charAt(i)<='z' )
	            alphabateChar++;
	            else if(A.charAt(i)>='0' && A.charAt(i)<='9')
	            digitChar++;
	        }
	        return alphabateChar>digitChar?alphabateChar:digitChar;
	    }
	public static void main(String[] args) {
		// Call solve

	}

}
