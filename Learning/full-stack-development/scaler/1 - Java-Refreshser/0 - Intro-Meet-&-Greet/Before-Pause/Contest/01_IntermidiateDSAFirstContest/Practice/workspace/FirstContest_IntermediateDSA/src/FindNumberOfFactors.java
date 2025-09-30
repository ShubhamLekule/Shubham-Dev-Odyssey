
public class FindNumberOfFactors {

	public static int numOfFactor(int N) {
		int count=0;
		for(int i=1;i<=N/2;i++) 
			if(N%i==0)count+=2;
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println(numOfFactor(24));
		System.out.println(numOfFactor(10));

	}

}
