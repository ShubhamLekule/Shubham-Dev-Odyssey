import java.util.ArrayList;
import java.util.Scanner;
public class NumericStaircase2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
		for(int i=1;i<=N;i++) {
			ArrayList<Integer> list1d=new ArrayList<Integer>();
			for(int j=1;j<=i;j++) {
				list1d.add(j);
			}
			arr.add(list1d);
		}
		for(int i=0;i<N;i++) {
			System.out.println(arr.get(i));
		}

	}

}
