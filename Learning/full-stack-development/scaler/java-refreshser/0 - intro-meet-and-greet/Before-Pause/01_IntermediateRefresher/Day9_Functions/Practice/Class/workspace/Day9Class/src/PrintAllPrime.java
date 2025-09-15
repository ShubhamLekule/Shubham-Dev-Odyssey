import java.util.Scanner;

public class PrintAllPrime {
	
	public static void printPrime(int N) {
		int i=1;
		while(i<=N) {
			int j=1;
			int count =0;
			while(j<=i) {
				if(i%j==0) 
				count++;
				j++;
			}
			if(count==2)
			System.out.println(i);
			i++;
		}
	}
	
	public static boolean isPrime(int n) {
		int j=1;
		int count =0;
		while(j<=n) {
			if(n%j==0) 
			count++;
			j++;
		}
		return count==2?true:false;
	}
	
	public static void listPrime(int n) {
		for(int i=1;i<=n;i++)
			if(isPrime(i))System.out.println(i);
	}
	
	public static void main(String[] args) {
		//printPrime(new Scanner(System.in).nextInt());
		listPrime(new Scanner(System.in).nextInt());

	}

}
