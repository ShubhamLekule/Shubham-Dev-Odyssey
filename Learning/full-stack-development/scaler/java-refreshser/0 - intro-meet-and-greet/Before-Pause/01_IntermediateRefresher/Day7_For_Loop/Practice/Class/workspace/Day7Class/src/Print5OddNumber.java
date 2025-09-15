
public class Print5OddNumber {

	public static void main(String[] args) {
		int N=10;
		for(int i=1;i<=N;i++) {
			if(i%2==0)continue;
			System.out.print(i+" ");
		}
		// this code just for continue code there is optimize way to run this code by using i+=2
	}

}
