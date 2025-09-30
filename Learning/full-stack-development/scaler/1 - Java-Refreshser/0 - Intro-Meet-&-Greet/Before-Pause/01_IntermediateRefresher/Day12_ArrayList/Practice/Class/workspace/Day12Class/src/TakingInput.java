import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TakingInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		for(int i=0;i<N;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list);
		
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(4,5,6));
		System.out.println(list2);
	}

}
