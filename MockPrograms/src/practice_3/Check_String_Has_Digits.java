package practice_3;

public class Check_String_Has_Digits {
	
	static  boolean only_digits(String str)
	{
		char ch[]=str.toCharArray();
		
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

	public static void main(String[] args) 
	{
		String s1="12345";
		String s2="abc123";
		
		if(only_digits(s1)==true)
		{
			System.out.println("String contains only digits");
		}
		else
			System.out.println("String contains aplhabets and digits");
		
		if(only_digits(s2)==true)
		{
			System.out.println("String contains only digits");
		}
		else
			System.out.println("String contains aplhabets and digits");
	}

}
