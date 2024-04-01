package mock_Interview.practice_1;

public class Check_str_has_digits {
	
	
	static boolean contains_only_digits(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length(); i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				continue;
			}
			else
				return false;
			
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		String s1="12345";
		String s2="abc123";
		
		if(contains_only_digits(s1)==true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		if(contains_only_digits(s2)==true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
			
		
	}

}
