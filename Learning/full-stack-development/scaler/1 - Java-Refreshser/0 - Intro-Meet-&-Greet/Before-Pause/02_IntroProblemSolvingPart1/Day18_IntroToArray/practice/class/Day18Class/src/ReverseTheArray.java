
public class ReverseTheArray {
	//Time Complexity n/2 : O(n)
	//Space Complexity i 4 byte+ j 4bye =8byte O(1)
	public static void revArr(int arr[]) {
		int i=0;
		int j=arr.length-1;
		System.out.println(arr.length-1);
		while(i<j) {
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;
			j--;
		}
		// Till above part
		//Time Complexity n/2 : O(n)
		//Space Complexity i 4 byte+ j 4bye =8byte O(1)
		System.out.println(arr.length-1);
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5,6};
		revArr(arr);
		revArr(arr2);

	}

}
