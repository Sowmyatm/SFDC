package mock_Interview.practice_1;

import java.util.Scanner;

public class Str_rev {
	
	static void str_rev(String str)
	{
		String rev ="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev=ch+rev;
			
		}
		
		System.out.println("reversed string is: " + rev);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be rerversed :");
		String str = sc.nextLine();
		
		str_rev(str);
		sc.close();
		
		
	}

}
