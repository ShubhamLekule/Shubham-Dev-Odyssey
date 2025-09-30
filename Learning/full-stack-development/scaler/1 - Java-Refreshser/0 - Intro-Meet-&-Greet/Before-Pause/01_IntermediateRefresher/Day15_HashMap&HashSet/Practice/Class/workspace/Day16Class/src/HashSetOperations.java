import java.util.HashSet;

public class HashSetOperations {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println(hs);
		
		//basic operations
		
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.add(5);
		hs.add(0);
		hs.add(8);
		hs.add(-10);
		System.out.println(hs);
		
		//contains
		System.out.println(hs.contains(8));
		System.out.println(hs.contains(87));
		System.out.println(hs.size());
		System.out.println(hs.remove(5));
		System.out.println(hs.remove(-5));
		System.out.println(hs);
		
		//print
		for(int i:hs) {
			System.out.print(i+" ");
		}

	}

}
