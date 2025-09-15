import java.util.Scanner;
public class OddOrEven {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		if(new Scanner(System.in).nextInt()%2==0) System.out.println("Even");
		else System.out.println("Odd");
	}

}
