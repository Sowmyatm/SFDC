package practice_3;

import java.util.Scanner;

public class String_Rev_Palin {
	
	static void string_Rev_palin(String str)
	{
		
		char ch[]=str.toCharArray();
		String rev="";
		String org_str=str;
		
		for(int i=0;i<str.length();i++)
		{
			rev=ch[i]+rev;
		}
		System.out.println(rev);
		
		if(org_str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		
		string_Rev_palin(str);
		sc.close();
	}

}
