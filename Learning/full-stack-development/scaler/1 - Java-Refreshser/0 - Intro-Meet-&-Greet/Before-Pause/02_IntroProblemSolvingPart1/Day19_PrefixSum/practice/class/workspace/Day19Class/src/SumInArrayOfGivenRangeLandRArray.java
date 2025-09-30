/*
 * Q.  Given N elements and Q querires For each query calculate sum of all elements
 from L to R[0 base index]
 */
public class SumInArrayOfGivenRangeLandRArray {

	public static int[] preFixSum(int[] arr) {
		int[] p=new int[arr.length];
		p[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			p[i]=p[i-1]+arr[i];
		}
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(p[i]+ " ");
//		}
		return p;
	}
	public static int[] preFixSum2(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i];
		}
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(p[i]+ " ");
//		}
		return arr;
	}
	public static void print(int[] p,int L,int R) {
		if(L==0)
			System.out.print(p[R]);
		else
			System.out.print(p[R]-p[L-1]);
	}
	public static void main(String[] args) {
		int[] arr= {-3,6,2,4,5,2,8,-9,3,1};
		int[][] Q= {{4,8},{3,7},{1,3},{0,4},{7,7}};
		
		int[] p=preFixSum(arr);
		for(int i=0;i<Q.length;i++) {
			print(p,Q[i][0],Q[i][1]);
			System.out.println();
		}
		
		//Optimize Space as well with below Appraoch
		System.out.println("------------------------");
		arr=preFixSum2(arr);
		for(int i=0;i<Q.length;i++) {
			print(arr,Q[i][0],Q[i][1]);
			System.out.println();
		}

	}
	/*
	 * 		0	1
	 * 0	4	8
	 * 1	3	7
	 * 2	1	3
	 * 3	0	4
	 * 4	7	7
	 */

}
