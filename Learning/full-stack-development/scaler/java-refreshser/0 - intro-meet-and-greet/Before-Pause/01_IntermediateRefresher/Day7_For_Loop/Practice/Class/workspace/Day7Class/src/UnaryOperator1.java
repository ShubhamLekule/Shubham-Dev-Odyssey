
public class UnaryOperator1 {

	public static void main(String[] args) {
		int i=1,j=1;
		System.out.println(++i);
		//op:2 1st update then work
		System.out.println(i);
		//op:2
		System.out.println(j++);
		//op:1 1st work then update
		System.out.println(j);
		//op:2
	}

}
