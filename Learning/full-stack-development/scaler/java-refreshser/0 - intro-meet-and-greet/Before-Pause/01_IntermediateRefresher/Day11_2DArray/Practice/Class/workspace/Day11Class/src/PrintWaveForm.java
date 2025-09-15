
public class PrintWaveForm {

	public static void main(String[] args) {
		int[][] arr={{2,3,1,5},{6,4,1,9},{0,9,8,1},{3,9,1,5}};
		/*
		 * original matrix is
		 * 	2,3,1,5
		 * 	6,4,1,9
		 * 	0,9,8,1
		 * 	3,9,1,5
		 * 
		 * waveform matrix is:
		 * 	2,3,1,5
		 * 	9,1,4,6 //rev
		 * 	0,9,8,1
		 * 	5,1,9,3	//rev
		 * 
		 * 	
		 * 	i
		 *j 00 01 02 03
		 * 	13 12 11 10
		 * 	20 21 22 21
		 * 	33 32 31 3o
		 */
		
		for(int i=0;i<arr.length;i++) {//row
			if(i%2==0) {
			for(int j=0;j<arr[0].length;j++) {//column
				System.out.print(arr[i][j]+" ");
			}
			}else {
				for(int j=arr[0].length-1;j>=0;j--) {//column
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
