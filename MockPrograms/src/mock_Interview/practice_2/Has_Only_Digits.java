package mock_Interview.practice_2;

import java.util.Scanner;

public class Has_Only_Digits {
	
	public static boolean Has_Digits1(String str)
	{
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				continue;
				
			}
			else 
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		String s1="7999";
		String s2 = "jjkkjnn";
		
		if(Has_Digits1(s1)==true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
			if(Has_Digits1(s2)==true)
			{
			System.out.println("True");
			}
		else
		{
			System.out.println("False");
         }
	}

}
