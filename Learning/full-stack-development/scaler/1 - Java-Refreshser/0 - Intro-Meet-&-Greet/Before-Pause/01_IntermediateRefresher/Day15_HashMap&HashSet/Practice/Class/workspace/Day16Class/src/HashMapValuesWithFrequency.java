import java.util.HashMap;

public class HashMapValuesWithFrequency {

	public static void main(String[] args) {
		int[] arr= {1,4,3,-2,1,1,4,5,3};
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i])+1);
			else
				hm.put(arr[i], 1);
		}
		System.out.println(hm);

	}

}
