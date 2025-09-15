package scaler.practice.scannerclass;

import java.util.Scanner;

public class StringRead {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str1 = ip.next();
        System.out.println("single word : "+str1);
        String str2=ip.nextLine();
        System.out.println("whole line after reading 1st word: "+str2);
    }
}
