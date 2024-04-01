package mock_Interview.Practice;

//WJP to check if a String contains only digits.
//a. String a = “12378” output = true
//b. String b = “abc123” output = false

public class Contains_digits_in_string {

	public static boolean is_digit(String str) 
	{
			
			char ch[]=str.toCharArray();
			
			for(int i =0; i<str.length(); i++)
			{
				if(ch[i]>=48 && ch[i]<=57) //or if(ch[i]>='0'&&ch[i]<='9')
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
				String str1 = "abc12378";
				String str2= "123";
				
				if(is_digit(str1)==true)
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
					System.out.println("False");
		}
}	


	
