
public class SumOfElement {

	public static void main(String[] args) {
		int[][] arr={{1,3,-2},{9,0,8}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {//row
			for(int j=0;j<arr[0].length;j++) {//column
				sum=sum+arr[i][j];
			}
			
		}
		System.out.println(sum);
	}

}
