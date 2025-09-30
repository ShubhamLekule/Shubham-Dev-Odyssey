/*
 * Print number's digit
 * 
 * Input 6531
 * output 1 3 5 6
 */
import java.util.Scanner;
public class Print10 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		int num=new Scanner(System.in).nextInt();
		if(num==0)System.out.println("0");
		else
		while(num>0) {
			System.out.print(num%10+" ");
			num=num/10;
		}

	}

}
