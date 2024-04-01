package pgms;

public class Sec_String_Inside_First {

	public static void main(String[] args) {
		
		String str1="<<>>";
		String str2="yay";
		
		int l1=str1.length();
		String sub=str1.substring(0, l1/2)+str2+str1.substring(l1/2, l1);
		System.out.println(sub);
	}

}
