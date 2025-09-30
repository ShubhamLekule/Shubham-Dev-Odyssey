
public class Operator5 {

	public static void main(String[] args) {
		int x=100000;
		int y=100000;
		// int * int = int, if result of int * int is long value then it leads to garbage value
		// 10^5(Hold by int) * 10^5 (Hold by int) = 10^10(Hold by long) but as per precision its hold by int
		System.out.println(x*y);
		// OP : 1410065408
	}

}
