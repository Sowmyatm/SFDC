package pgms;

public class Dig_in_Str {
	
	public static boolean dig_str(String str)
	{
		char ch[] =str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				continue;
			}
			else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String str1="2336";
		String str2="390a";
		
		if(dig_str(str1)==true)
		{
			System.out.println("true");
		}
		else
			System.out.println("False");
		if(dig_str(str2)==true)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}