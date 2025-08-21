package scaler.practice.simpleinterest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int p=ip.nextInt();
        int r=ip.nextInt();
        int t=ip.nextInt();

        int si = (p * r * t)/100;
        System.out.println("Simple Interest :"+si);
    }
}
