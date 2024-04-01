package mock_Interview.Practice;

import java.util.Scanner;

public class String_Words_Reverse
{
		 String reverse_str(String str)
		{
			String reversed_str="";
			char ch;
			
			for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i);
				reversed_str=ch+reversed_str;
			}
			
			
			System.out.println(reversed_str);
			return (reversed_str);
		
		}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String str=sc.nextLine();
		//reverse_str(str);
		
		String_Words_Reverse rev_str = new String_Words_Reverse();
		str= rev_str.reverse_str(str);
		
		String strArray[]= str.split("\s+");
		
		for(int i=0;i<strArray.length;i++)
		{
			strArray[i]=rev_str.reverse_str(strArray[i]);
			
		}
		String rev_words =strArray[0];
		
		for(int i=1;i<strArray.length;i++)
		{
			rev_words=rev_words+" "+strArray[i];
		}
		
		System.out.println(rev_words);
		
		
		
		sc.close();
	}

}
