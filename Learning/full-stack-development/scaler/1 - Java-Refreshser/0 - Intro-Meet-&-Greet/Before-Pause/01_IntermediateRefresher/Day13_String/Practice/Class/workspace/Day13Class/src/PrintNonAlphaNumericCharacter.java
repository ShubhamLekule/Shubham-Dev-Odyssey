
public class PrintNonAlphaNumericCharacter {

	public static void main(String[] args) {
		String str="Sdq12$#heb&b8**><?hf3";
		String nonAlphaNum="";
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') ||(str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='0' && str.charAt(i)<='9')) {
				continue;
			}
			nonAlphaNum+=str.charAt(i);
		}
		System.out.println(nonAlphaNum);
	}

}
