import java.util.ArrayList;
import java.util.Arrays;

public class MultipleOfFiveAndSeven {
	public static ArrayList<Integer> multipleOfFiveAndSeven(ArrayList<Integer> arr){
		ArrayList<Integer> mul=new ArrayList<Integer>();
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)%5==0 || arr.get(i)%7==0)
				mul.add(arr.get(i));
		}
		
		return mul;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,5,3,0,7));
		
		ArrayList<Integer> mul=multipleOfFiveAndSeven(arr);
		System.out.println(mul);
	}

}
