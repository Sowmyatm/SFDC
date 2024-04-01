package mock_Interview.Practice;

import java.util.Scanner;

public class Str_Rev {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string: ");
	
		String str="Java code";
		
		
		char ch[]=str.toCharArray();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
		}
		System.out.println("Reversed string is: " + rev);
		
//		StringBuffer sb =new StringBuffer(str);
//		System.out.println(sb.reverse());
		

	}

}
