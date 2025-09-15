
public class StringPalindrome {

	public static void main(String[] args) {
		String yes="mom";
		String no="Shubham";
		
		String rev="";
		for(int i=0;i<yes.length();i++) {
			rev=yes.charAt(i)+rev;
		}
		
		if(rev.equals(yes)) {
			System.out.println(yes+" is palimdorm");
		}
		
		rev="";
		for(int i=0;i<no.length();i++) {
			rev=no.charAt(i)+rev;
		}
		
		if(!rev.equals(no)) {
			System.out.println(no+" is not palimdorm");
		}

	}

}
