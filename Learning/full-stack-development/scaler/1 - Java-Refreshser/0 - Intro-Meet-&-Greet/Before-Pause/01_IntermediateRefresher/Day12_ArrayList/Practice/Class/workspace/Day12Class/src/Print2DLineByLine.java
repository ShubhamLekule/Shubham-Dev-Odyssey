import java.util.ArrayList;

public class Print2DLineByLine {

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
		
		for(int i=0;i<list2d.size();i++) {
			for(int j=0;j<list2d.get(i).size();j++) {
				System.out.print(list2d.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
