package programs;

import java.util.Arrays;

public class Anagrams {
	
	public static void anagrams(String str1, String str2)
	{
		String st1=str1.toLowerCase();
		String st2=str2.toLowerCase();
		
		if(st1.length()!=st2.length())
		{
			System.out.println("Not Anagrams");
		}
		
		else 
		{	
			char ch1[]=st1.toCharArray();
			char ch2[]=st2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Anagrams");
			}
			else
				System.out.println("Not anagrams");
		}
	}

	public static void main(String[] args) {
		
		String s1="PEEKs1";
		String s2="1SPEek";
		
		anagrams(s1,s2);
	}

}
