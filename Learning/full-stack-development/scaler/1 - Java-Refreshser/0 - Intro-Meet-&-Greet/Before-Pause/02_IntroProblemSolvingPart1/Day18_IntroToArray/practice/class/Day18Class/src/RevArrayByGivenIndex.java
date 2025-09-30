
public class RevArrayByGivenIndex {
	public static void revArr(int arr[],int l,int r) {

		System.out.println(arr.length-1);
		while(l<r) {
			arr[l]=arr[l]+arr[r];
			arr[r]=arr[l]-arr[r];
			arr[l]=arr[l]-arr[r];
			l++;
			r--;
		}
		// Till above part
		//Time Complexity: in worst case l=0 & r=n-1 then n/2 : O(n)
		//Space Complexity , 0 byte space so O(1)
		System.out.println(arr.length-1);
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5,6};
		revArr(arr,1,3);
		revArr(arr2,1,4);

	}

}
