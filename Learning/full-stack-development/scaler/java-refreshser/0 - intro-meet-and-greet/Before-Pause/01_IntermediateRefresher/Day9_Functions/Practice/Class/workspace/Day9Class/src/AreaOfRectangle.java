import java.util.Scanner;
public class AreaOfRectangle {
	
	public static double areaOfRectangle(double h,double w) {
		return h*w;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Rectangle : "+areaOfRectangle(sc.nextDouble(), sc.nextDouble()));
		sc.close();
	}

}
