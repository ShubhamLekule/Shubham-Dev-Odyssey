
public class HowStrongPassword {

	public static void main(String[] args) {
		String str="rock324";
		int alphaCount=0;
		int numCount=0;
		int specialCharCount=0;
//		if(str.length()<=8) {
//			System.out.println("passowrd is Low");
//		}
//		else {
//			for(int i=0;i<str.length();i++) {
//				if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z'))
//					alphaCount++;
//				else if(str.charAt(i)>='0' && str.charAt(i)<='9')
//					numCount++;
//				else specialCharCount++;
//			}
//			if(specialCharCount>0)
//				System.out.println("password is Strong");
//			else System.out.println("password is moderate");
//		}
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z'))
				alphaCount++;
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
				numCount++;
			else specialCharCount++;
		}
		
		if(str.length()<=8) System.out.println("Low");
		else if(alphaCount>0 && numCount==0 && specialCharCount==0) System.out.println("Low");
		else if(alphaCount>0 && numCount>0 && specialCharCount==0) System.out.println("Moderate");
		else if(alphaCount>0 && numCount>0 && specialCharCount>0) System.out.println("High");
		else System.out.println("Enter valid password");

	}

}
