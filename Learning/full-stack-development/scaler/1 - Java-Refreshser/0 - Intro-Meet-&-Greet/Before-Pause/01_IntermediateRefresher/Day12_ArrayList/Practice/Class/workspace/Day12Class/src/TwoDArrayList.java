import java.util.ArrayList;

public class TwoDArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(7);
		a3.add(8);
		a3.add(9);
		
		ArrayList<ArrayList<Integer>> list2d=new ArrayList<ArrayList<Integer>>();
		list2d.add(a1);
		list2d.add(a2);
		list2d.add(a3);
		
		System.out.println(list2d);
		//op:[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		
		System.out.println(list2d.get(2).get(1));

	}

}
