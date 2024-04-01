package mock_Interview.practice_2;

import java.util.Scanner;

public class CountChars {
	
	public static void count_chars(String str) {
		
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
				
			}
		}
		System.out.println("No of chars is : " + count);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		count_chars(str);
	}

}
