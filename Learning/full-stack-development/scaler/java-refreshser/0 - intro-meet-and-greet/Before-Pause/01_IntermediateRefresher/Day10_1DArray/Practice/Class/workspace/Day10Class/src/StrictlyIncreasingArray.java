
public class StrictlyIncreasingArray {
	
	public static boolean isStrictlyIncresing(int[] A) {
		
		for(int i=0;i<A.length-1;i++) {
			if(A[i+1]>A[i]) continue;
			else return false;
		}
		return true;
	}
	
public static boolean isStrictlyIncresing2(int[] A) {
		
		for(int i=0;i<A.length-1;i++) {
			if(A[i]>=A[+1i]) continue;
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		//int[] arr= {1,2,1,1,3,0,2,1,2};
		//int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] arr= {1,2,3,4,5,6,8,8,9};
		System.out.println(isStrictlyIncresing(arr));
	}

}
