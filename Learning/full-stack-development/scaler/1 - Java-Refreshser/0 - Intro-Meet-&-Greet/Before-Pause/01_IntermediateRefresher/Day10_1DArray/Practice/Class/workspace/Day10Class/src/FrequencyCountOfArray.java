
public class FrequencyCountOfArray {
	
//	public static int[] findElement(int[] A) {
//		int[] frq=new int[A.length];
//		
//		for(int i=0;i<A.length;i++) {
//			frq[i]=0;
//			for(int j=0;j<A.length;j++) {
//				if(A[j]==A[i])
//				frq[i]++;
//			}
//		}
//		
//		return frq;
//	}
	public static int findElement(int[] A,int num) {
		int frq=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]==num)
			frq++;
		}
		return frq;
	}
	
	public static int[] frqArr(int[] A) {
		int[] frq=new int[A.length];
		for(int i=0;i<A.length;i++) {
			frq[i]=findElement(A,A[i]);
		}
		
		return frq;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,1,1,3,0,2,1,2};
		//int[] freqArr=findElement(arr);
		int[] freqArr=frqArr(arr);
		for(int i=0;i<freqArr.length;i++) {
			System.out.print(freqArr[i]+" ");
		}

	}

}

