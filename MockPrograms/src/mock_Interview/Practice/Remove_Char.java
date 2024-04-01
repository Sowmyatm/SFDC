package mock_Interview.Practice;

import java.util.Scanner;

public class Remove_Char {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str =sc.nextLine();
		
		System.out.println("Enter an index: ");
		int a = sc.nextInt();
		
		Remove_Char str1=new Remove_Char();
		System.out.println(str1.rem_char(str,a));
		sc.close();
	}

	String rem_char(String str, int a)
	{
		String str2=str.substring(0, a);
		String str3=str.substring(a+1, str.length());
		
		return (str2+str3);
		
	}
	
}
