import java.util.Scanner;
public class EvenOrOdd {
	
	public static boolean isEven(int a) {
//		return a%2==0?true:false;
		return a%2==0;
	}

	public static void main(String[] args) {
		System.out.println(isEven(new Scanner(System.in).nextInt()));
	}

}
