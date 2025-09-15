/*
 * Q3: Patient's Temperature
 * 
 * Given Temperature of a patient in farenheit as input,
 * print whether Temperature is low , normal or high
 * 
 * normal ->98.2 till 98.8
 * 
 * Input: 98.1
 * Output:Low
 * 
 * Input: 98.5
 * Output:normal
 * 
 * Input: 99.398.1
 * Output:high
 * */

import java.util.Scanner;

public class PatientTemperature2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double temp=sc.nextDouble();
		if(temp>98.8) System.out.println("high");
		else if(temp<98.2) System.out.println("low");
		else System.out.println("normal");
	}

}
