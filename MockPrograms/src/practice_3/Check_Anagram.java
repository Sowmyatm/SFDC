package practice_3;

import java.util.Arrays;

public class Check_Anagram 
{
	
	static void check_anagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			System.out.println("Strings are not anagrams");
		}
		else
		{	
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Strings are anagrams");
			}
			else
				System.out.println("Strings are not anagrams");
		}
	}
	
	

	public static void main(String[] args)
	{
		String str1="keeps";
		String str2="peek";
		
		check_anagram(str1,str2);
	}

}
