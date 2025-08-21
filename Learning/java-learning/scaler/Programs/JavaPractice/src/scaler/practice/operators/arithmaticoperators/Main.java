package scaler.practice.operators.arithmaticoperators;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        // Addition
        System.out.println(a+b);
        // Subtraction
        System.out.println(a-b);
        // Multiplication
        System.out.println(a*b);
        // Division
        System.out.println(a/b);
        // Modulo
        System.out.println(a%b);

        System.out.println("Typecasting with arithmetic operator");
        int x = 10;
        int y = 3;
        System.out.println(x/y);
        System.out.println((float)(x/y));
        System.out.println((float) x/y);
        System.out.println(x/(float)y);
        System.out.println((float) x/(float) y);
    }
}
