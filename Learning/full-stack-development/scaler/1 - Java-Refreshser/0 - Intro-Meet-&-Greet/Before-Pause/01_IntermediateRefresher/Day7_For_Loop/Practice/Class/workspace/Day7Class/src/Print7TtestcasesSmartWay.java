/*
 * T : Number of input num
 * N: Number
 * 
 * print last digit of number
 */
import java.util.Scanner;
public class Print7TtestcasesSmartWay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)System.out.println(sc.nextInt()%10);
		
		//Again there is smart way for above line of code,
		//Below not for java, any integer is True , 0 is false
		//while(T--)System.out.println(sc.nextInt()%10);
	}

}
