/*
 * 
 * prime number is the number grater than 0 and which having only two factors that are 1 and number itself
 */
public class Print4PrimeNumber {

	public static void main(String[] args) {
		//int N=24;
		int N=13;
		int count=0;
		for(int i=1;i<=N;i++) {
			if(N%i==0)
				count++;
			if(count>2)
				break;
		}
		if(count!=2)System.out.println("Not a prime number");
		else System.out.println("prime number");

	}

}
