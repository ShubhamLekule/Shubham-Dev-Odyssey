
public class Operator6 {

	public static void main(String[] args) {
		int x=100000;
		int y=100000;
		long z=x*y;
		// int * int = int, if result of int * int is long value then it leads to garbage value
		// 10^5(Hold by int) * 10^5 (Hold by int) = 10^10(Hold by long) but as per precision its hold by int
		System.out.println(z);
		//Though we are storing into long variable z the right side result leads to int
		// with "=" there are two instruction left side and right side, right side executed 1st.
		// as per right side its int * int = int then the result int stored in long variable z
		// OP : 1410065408

	}

}
