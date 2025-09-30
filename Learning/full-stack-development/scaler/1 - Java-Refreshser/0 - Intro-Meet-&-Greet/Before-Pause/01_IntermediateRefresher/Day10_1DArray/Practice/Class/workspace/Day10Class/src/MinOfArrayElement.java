
public class MinOfArrayElement {
	
	public static int minElement(int[] A) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++) if(A[i]<min)min=A[i];
		return min;
	}
	public static void main(String[] args) {
		int[] arr= {10,2,35,26,100};
		System.out.println(minElement(arr));

	}

}
