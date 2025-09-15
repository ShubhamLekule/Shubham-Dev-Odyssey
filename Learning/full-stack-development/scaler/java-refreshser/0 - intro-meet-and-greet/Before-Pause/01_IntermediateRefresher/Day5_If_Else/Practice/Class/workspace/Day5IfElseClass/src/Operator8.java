
public class Operator8 {

	public static void main(String[] args) {
		int x=100000;
		int y=100000;
		long z=(long)x*y;
		//here x 1st type casted to long that means long * int which result is long as per precision
		//then this long result stored in long variable z thats why here no garbage value
		System.out.println(z);
		//OP:10000000000

	}

}
