package pgms;

import java.util.Arrays;

public class Anagram {

	public static void anagram(String s1, String s2)
	{
		String str1= s1.toLowerCase();
		String str2 = s2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Not anagrams");
		}
		else
		{	
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch2);
			Arrays.sort(ch1);
			
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Anagrams");
			}
			
			else
				System.out.println("Not anagrams");
		}
	}
	
	public static void main(String[] args) {
		
		String s1="SPAMaas";
		String s2 ="saMAPS";
		
		anagram(s1,s2);
		
	}

}
