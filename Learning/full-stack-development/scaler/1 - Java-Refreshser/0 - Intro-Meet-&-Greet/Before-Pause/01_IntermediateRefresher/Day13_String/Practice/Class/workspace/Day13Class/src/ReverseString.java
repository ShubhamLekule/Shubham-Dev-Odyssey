
public class ReverseString {

	public static void main(String[] args) {
		String str="Shubham";
		//below is working code
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
		
		//Another way
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println(rev);

	}

}
