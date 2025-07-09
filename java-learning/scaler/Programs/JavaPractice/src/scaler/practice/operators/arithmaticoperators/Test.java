package scaler.practice.operators.arithmaticoperators;

public class Test {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int c = a / b;
        // In below after b<= 10 failed it won't check for (a/c >= 5) so answer is false
        System.out. println( (a >= 5) && (b <= 10) && (a/c >= 5));
    }
}
