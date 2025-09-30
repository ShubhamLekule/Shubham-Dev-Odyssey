
public class SumEvenNumberIndex {
	public static int[] prefixSumEvenArray(int[] arr) {
		int[] PFe=new int[arr.length];
		PFe[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(i%2==0) {
				PFe[i]=PFe[i-1]+arr[i];
			}else {
				PFe[i]=PFe[i-1];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(PFe[i]+" ");
		}
		return PFe;
	}
	public static void print(int[] PFe,int L, int R) {
		if(L==0)
			System.out.println(PFe[R]);
		else
			System.out.println(PFe[R]-PFe[L>0?L-1:L]);
	}
	public static void main(String[] args) {
		int[] arr= {2,3,1,6,4,5};
		int[][] Q= {{1,3},{2,5},{0,4},{3,3}};
		int[] PFe=prefixSumEvenArray(arr);
		System.out.println();
		for(int i=0;i<Q.length;i++) {
			print(PFe,Q[i][0],Q[i][1]);
		}

	}

}
