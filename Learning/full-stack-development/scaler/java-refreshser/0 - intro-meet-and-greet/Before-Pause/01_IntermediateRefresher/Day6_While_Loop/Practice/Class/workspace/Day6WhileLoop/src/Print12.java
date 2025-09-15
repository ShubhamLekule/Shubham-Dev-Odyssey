/*
 * Reverse the number
 * 
 * Input 6531
 * output 1356
 */
import java.util.Scanner;
public class Print12 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		int num=new Scanner(System.in).nextInt();
		int rev=0;
				if(num==0)
					System.out.println("0");
				else 
					while(num>0) {
						rev=rev*10+num%10;
						num=num/10;
					}
				System.out.println(rev);

	}

}
