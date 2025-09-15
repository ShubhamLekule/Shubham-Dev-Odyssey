import java.util.Scanner;
public class FindHight {
	public static String findHight(int num) {
		return (num>20?"large":num<10?"small":"medium");
	}
	public static void main(String[] args) {
		System.out.println(findHight(new Scanner(System.in).nextInt()));
		//can't use int x=09 bcoz starting number with 0 consider as octal
	}
}
