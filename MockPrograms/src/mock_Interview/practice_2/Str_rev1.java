package mock_Interview.practice_2;

import java.util.Scanner;

public class Str_rev1 {
	
	public static void str_rev(String str) {
		
		String rev = " ";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		str_rev(str);
		
		sc.close();
	}

}
