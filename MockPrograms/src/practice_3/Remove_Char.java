package practice_3;

import java.util.Scanner;

public class Remove_Char {
	
	
	static void remove_char(String str, int n)
	{
		String temp=" ";
		String str1=str.substring(0,n);
		String str2=str.substring(n+1,str.length());
		temp=str1+str2;
		System.out.println(temp);
		
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str =sc.nextLine();
		
		System.out.println("Enter the index:");
		int n =sc.nextInt();
		
		remove_char(str, n);
		sc.close();
		
	}
}
