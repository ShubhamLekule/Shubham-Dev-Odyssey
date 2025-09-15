import java.util.Arrays;
import java.util.HashSet;

public class PrintCommonElementInHashSet {
	
	public static void printCommonElm(HashSet<Integer> hs1,HashSet<Integer> hs2) {
		//working
//		for(int i:hs1)
//			for(int j:hs2)
//				if(i==j)
//					System.out.print(i+" ");
		for(int i:hs1)
			if(hs2.contains(i))
				System.out.print(i+" ");
		
	}
	
	public static void main(String[] args) {
		HashSet<Integer> hs1=new HashSet<Integer>(Arrays.asList(0,-2,3,10));
		HashSet<Integer> hs2=new HashSet<Integer>(Arrays.asList(1,-2,3,4,5));
		printCommonElm(hs1,hs2);
		//another way to add
//		HashSet<String> fruits = new HashSet<String>() {{
//			add("apple");
//			add("banana");
//			add("cherry");
//			}};

	}

}
