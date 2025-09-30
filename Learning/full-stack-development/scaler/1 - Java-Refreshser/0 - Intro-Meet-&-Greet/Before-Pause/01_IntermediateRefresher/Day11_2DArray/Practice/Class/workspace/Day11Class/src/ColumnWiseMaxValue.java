
public class ColumnWiseMaxValue {

	public static void main(String[] args) {
		int[][] arr={{2,3,1,5},{6,4,1,9},{0,9,8,1},{3,9,1,5}};
		int[] max=new int[arr.length];
		for(int i=0;i<arr.length;i++) {//row
			max[i]=Integer.MIN_VALUE;
			for(int j=0;j<arr[0].length;j++) {//column
				if(arr[j][i]>max[i])max[i]=arr[j][i];
			}
		}
		for(int i=0;i<max.length;i++) System.out.print(max[i]+" ");

	}

}
