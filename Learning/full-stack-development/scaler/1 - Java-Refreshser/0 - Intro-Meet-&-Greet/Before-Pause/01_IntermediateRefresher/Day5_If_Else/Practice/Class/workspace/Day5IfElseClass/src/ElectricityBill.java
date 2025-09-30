/*
 * Q6: Electricity bill problem
 * 
 * Given units of electricity as an integer input A,
 * print the bill amount
 * 
 * [1-50] -> 1 Rs
 * [51-100] -> 2 Rs
 * [101 and beyond] -> 4 Rs
 * 
 * Input: 20
 * Output:20 * 1=20
 * 
 * Input:80
 * Output: 50*1 +30*2=110
 * 
 * Input:120
 * Output:50*1 +50*2+20*4=50+100+80=230
 */
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int unit=new Scanner(System.in).nextInt();
		if(unit<=50)System.out.println(unit);
		else if(unit<=100)System.out.println(50+((unit-50)*2)); 
		else System.out.println(150+((unit-100)*4));

	}

}
