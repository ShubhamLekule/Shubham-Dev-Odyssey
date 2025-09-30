

public class FrequencyOfElementInArray {
	
	public static int findElement(int[] A,int num) {
		int frq=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]==num)
			frq++;
		}
		return frq;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,1,1,3,0,2,1,2};
		System.out.println(findElement(arr,1));

	}

}

