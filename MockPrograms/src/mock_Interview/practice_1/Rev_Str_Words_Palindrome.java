package mock_Interview.practice_1;

import java.util.Scanner;

//"Java code"

public class Rev_Str_Words_Palindrome {
	
	static String rev_str(String str)
	
	{
		String  org_str=str;
		
		String rev = "";
		//String org_str=str;//for palindrome
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		
		
		System.out.println(rev);
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str + " is palindrome");
		}
		else
		{
			System.out.println(org_str + " is not palindrome");
		}
		
		return rev;
	 
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Enter the string: ");
		
		String str= sc.nextLine();
		
		
		rev_str(str);

		Rev_Str_Words_Palindrome str_rev = new Rev_Str_Words_Palindrome();
		str = str_rev.rev_str(str);
		
		String strArray[]=str.split("\s+");
		for(int i=0;i<strArray.length;i++) 
		{
			 strArray[i]=str_rev.rev_str(strArray[i]);
						
		}
		String rev_words = strArray[0];
		for(int i=1;i<strArray.length;i++)
		{
			rev_words=rev_words+" "+strArray[i];
		}
		
		System.out.println(rev_words);
		
		
		
	
		
		sc.close();

	}

}
