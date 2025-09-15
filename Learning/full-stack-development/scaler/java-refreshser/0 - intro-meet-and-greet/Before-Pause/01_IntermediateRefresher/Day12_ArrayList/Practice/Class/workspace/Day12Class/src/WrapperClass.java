import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		Integer x=4;
		System.out.println(x);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.add(4);
		list.add(-1);
		list.add(0);
		
		System.out.println(list);
		System.out.println(list.get(1));

	}

}
