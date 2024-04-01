package mock_Interview.practice_2;

import java.util.Scanner;

public class Palindrome {
	
	public static void palin(String str)
	{
		String org_string  = str;
		String rev = "";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			rev=ch+rev;
		}
		if(org_string.equals(rev))
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		palin(str);
		sc.close();
	}
}
