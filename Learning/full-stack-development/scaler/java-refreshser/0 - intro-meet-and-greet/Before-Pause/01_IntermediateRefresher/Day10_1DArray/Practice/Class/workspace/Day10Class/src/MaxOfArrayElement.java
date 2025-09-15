
public class MaxOfArrayElement {

	public static void main(String[] args) {
		int[] arr= {3,7,2,10,1};
		//int max=0 // problem with is if array has negative numbers -1,-2,-3,-4,-5 we can't find max bcoz 0 
					// is max among negative number
		int max=arr[0];//this is one way
		//int num=Integer.MIN_VALUE;//this is another way
		for(int i=0;i<arr.length;i++)
		max=arr[i]>max?arr[i]:max;
		System.out.println(max);

	}

}
