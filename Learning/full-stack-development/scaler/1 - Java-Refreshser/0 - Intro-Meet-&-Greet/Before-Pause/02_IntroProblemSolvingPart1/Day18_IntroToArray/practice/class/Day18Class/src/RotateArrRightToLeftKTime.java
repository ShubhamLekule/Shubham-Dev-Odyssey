
public class RotateArrRightToLeftKTime {
	public static void rotate(int arr[],int k) {
		for(int i=0;i<k;i++) {
			int last=arr[arr.length-1];
			for(int j=arr.length-1;j>=1;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		//Till above
		//Time complexity is O(K*N)
		//Space complexity is O(1)
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
		System.out.println();
	}
	public static void optimizeRotate(int arr[],int k) {
		k=k%arr.length;
		// suppose k=0 or 5 the array will be same
		// if by chance k value greater than array size will use k=k%arr.length;
		// k=7 then k%arr.length is 7%5=2 array rotate 2 position which is equal to k=2
		arr=rev(arr, 0, arr.length-1);
		// n/2 iteration
		arr=rev(arr, 0, k-1);
		// k/2 iteration
		arr=rev(arr, k, arr.length-1);
		//(n-k)/2 iteration
		
		//till above
		
		// time complexity : (n/2)+(k/2)+((n-k)/2)=(n+k+n-k)/2=2n/2=n O(n)
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
		System.out.println();
		
	}
	public static int[] rev(int arr[],int l,int r) {
		while(l<r) {
			arr[l]=arr[l]+arr[r];
			// 5 4 3 2 1
			arr[r]=arr[l]-arr[r];
			// 4 5 3 2 1
			arr[l]=arr[l]-arr[r];
			// 4 5 1 2 3
			l++;
			r--;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5};
		//rotate(arr, 1);
		rotate(arr, 2);
		optimizeRotate(arr2, 7);
	}

}
