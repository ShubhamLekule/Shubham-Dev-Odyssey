
public class SumOfRow {

	public static void main(String[] args) {
		int[][] arr={{2,3,1,5},{6,4,1,9},{0,9,8,1},{3,9,1,5}};
		int[] sum=new int[arr.length];
		for(int i=0;i<arr.length;i++) {//row
			sum[i]=0;
			for(int j=0;j<arr[0].length;j++) {//column
				sum[i]+=arr[i][j];
			}
		}
		for(int i=0;i<sum.length;i++) System.out.print(sum[i]+" ");

	}

}
