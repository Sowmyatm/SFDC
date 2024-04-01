package mock_Interview.Practice;

import java.util.Scanner;

public class remchar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str = sc.nextLine();
		
		System.out.println("Enter the index");
		int n = sc.nextInt();
		
		rem_char(str,n);
		sc.close();
	}
	
	static void rem_char(String str, int n)
	{
		String str1 = str.substring(0, n);
		String str2 = str.substring(n+1, str.length());
		
		System.out.println(str1+str2);
	}

}
