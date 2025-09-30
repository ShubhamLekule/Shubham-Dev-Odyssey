import java.util.HashSet;

public class ReturnHashSet {
	public static HashSet<Integer> rtrnHS(int[] arr){
		HashSet<Integer> hs=new HashSet<Integer>();
//		for(int i=0;i<arr.length;i++)
//			hs.add(arr[i]);
		
		for(int i:arr) hs.add(i);
			
		return hs;
	}
	public static void main(String[] args) {
		int[] arr= {1,1,2,0,-12,2,1,3,3,4,4};
		System.out.println(rtrnHS(arr));

	}

}
