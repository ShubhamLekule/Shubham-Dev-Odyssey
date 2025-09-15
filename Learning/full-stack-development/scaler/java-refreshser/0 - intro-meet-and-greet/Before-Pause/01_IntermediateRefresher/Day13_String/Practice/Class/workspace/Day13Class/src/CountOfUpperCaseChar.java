
public class CountOfUpperCaseChar {

	public static void main(String[] args) {
		String str="India Is My Country";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			count++;
		}
		System.out.println(count);
	}

}
