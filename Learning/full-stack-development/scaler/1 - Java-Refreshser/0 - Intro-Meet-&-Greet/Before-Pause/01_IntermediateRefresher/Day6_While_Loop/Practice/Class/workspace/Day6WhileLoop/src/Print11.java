/*
 * Print number's digit's sum
 * 
 * Input 6531
 * output 1+3+5+6=15
 */
import java.util.Scanner;
public class Print11 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		int num=new Scanner(System.in).nextInt();
		int sum=0;
		if(num==0)System.out.println("0");
		else {
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
		}
	}

}
