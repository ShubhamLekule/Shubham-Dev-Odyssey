import java.util.Scanner;
public class AreaOfCircle {
	
	public static long areaOfCircle(double r) {
	return Math.round(Math.PI*r*r);
	}
	
	public static void main(String[] args) {
		System.out.println("Area of Circle : "+areaOfCircle(new Scanner(System.in).nextDouble()));
	}

}
