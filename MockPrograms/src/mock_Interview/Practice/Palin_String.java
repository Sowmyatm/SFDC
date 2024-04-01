package mock_Interview.Practice;

import java.util.Scanner;

public class Palin_String {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.next();
		String org_str = str;
		//char ch[]=str.toCharArray();
		

		String rev ="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev=ch+rev;
			
		}
		
//		String rev = "";
//		int len=str.length();
//		
//		for(int i=len-1;i>=0;i--)
//		//for(int i =len-1; i>=0; i--)
//		{
//			rev = rev+ch[i];
//		}
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str + " is palindrome" );
			
		}
		else
		{
			System.out.println(org_str + " is not palindrome" );
		}
		sc.close();
	}
	
	
}
