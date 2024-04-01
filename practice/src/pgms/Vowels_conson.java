package pgms;

import java.util.Scanner;

public class Vowels_conson {
	
	public static void vowel_conson(String str)
	{
		char ch[]=str.toCharArray();
		str.toLowerCase();
		
		int v_count=0;
		int cons_count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!=' ')
			{
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				{
					v_count++;
				}
				else
				{
					cons_count++;
				}
			}
		}
		System.out.println("Vowel count: " + v_count);
		System.out.println("Consonant count: " + cons_count);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String str = sc.nextLine();
		vowel_conson(str);
		sc.close();
		
	}

}
