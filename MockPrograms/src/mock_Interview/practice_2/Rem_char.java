package mock_Interview.practice_2;

import java.util.Scanner;

public class Rem_char {
	
	static void rem_char(String str, int i)
	{
		String str1=str.substring(0,i);
		String str2=str.substring(i+1,str.length());
		
		System.out.println(str1+str2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the index where character has to be removed:");
		int  i = sc.nextInt();
		
		rem_char(str,i);
		

	}

}
