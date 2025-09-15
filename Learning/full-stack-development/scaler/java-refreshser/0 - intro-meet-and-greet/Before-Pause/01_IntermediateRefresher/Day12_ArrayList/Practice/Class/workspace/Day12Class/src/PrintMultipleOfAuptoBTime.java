import java.util.ArrayList;

public class PrintMultipleOfAuptoBTime {

	public static void main(String[] args) {
		int A=2,B=4;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=B;i++)
			arr.add(A*i);
		
		System.out.println(arr);
	}

}
