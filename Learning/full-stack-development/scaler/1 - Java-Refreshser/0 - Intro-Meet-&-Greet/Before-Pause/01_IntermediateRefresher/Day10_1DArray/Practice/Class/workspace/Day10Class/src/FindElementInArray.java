

public class FindElementInArray {
	
	public static String findElement(int[] A,int num) {
		
		for(int i=0;i<A.length;i++) {
			if(A[i]==num)
			return "Present";
		}
		return "NotPresent";
	}
	public static void main(String[] args) {
		int[] arr= {10,2,35,26,100};
		System.out.println(findElement(arr,44));

	}

}
