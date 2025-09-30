//Problem Description
//Write a program to input T strings (S) from user and print count of vowels and consonants in it.
//
//
//
//Problem Constraints
//1 <= T <= 100
//
//1 <= S.size() <= 1000
//
//
//
//Input Format
//First line is T which means number of test cases.
//
//Each next T lines contain a lowercase string S.
//
//
//
//Output Format
//T lines each containing two space separated integers representing cont of vowels and consonants in input string.
//
//
//
//Example Input
//Input 1:
//
//2
//interviewbit
//scaler
//
//
//Example Output
//Output 1:
//
//5 7
//2 4

import java.util.Scanner;

public class VowelsVSConsonants {
	public static String vowelsVsConsonants(String s){
        int vCount=0;
        int cCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            vCount++;
            else cCount++;
        }
        return vCount+" "+cCount;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            System.out.println(vowelsVsConsonants(sc.next()));
        }

	}

}
