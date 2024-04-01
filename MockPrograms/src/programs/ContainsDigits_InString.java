package programs;

public class ContainsDigits_InString {
	
	public static boolean is_digit(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0; i<str.length();i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				continue;
			}
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "234";
		String str2= "34gh";
		
		if(is_digit(str)==true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		if(is_digit(str2)==true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	
}
}
