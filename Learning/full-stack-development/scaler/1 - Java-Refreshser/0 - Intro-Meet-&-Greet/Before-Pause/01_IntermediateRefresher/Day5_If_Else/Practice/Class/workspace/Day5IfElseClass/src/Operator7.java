
public class Operator7 {

	public static void main(String[] args) {
		int x=100000;
		int y=100000;
		long z=(long)x*y;
		// int * int = int, if result of int * int is long value then it leads to garbage value
		// 10^5(Hold by int) * 10^5 (Hold by int) = 10^10(Hold by long) but as per precision its hold by int
		System.out.println(z);
		//Though we are storing into long variable z and convertingthe right side result into long still 1st
		// x*y get calculated and its leads to the int value then int value type casted to long
		// with "=" there are two instruction left side and right side, right side executed 1st. in right side
		// also 1st x*y calculated then type casted to long when x*y calculated the result is int value then this 
		//int typecasted to long
		// as per right side its int * int = int then the result int type casted to long and stored in long variable z
		// OP : 1410065408

	}

}
