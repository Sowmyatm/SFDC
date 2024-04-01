package programs;

import java.util.Scanner;

public class Vowels_Consonant {
	
	public static void vowel_consonant(String str)
	{
		char ch[]=str.toCharArray();
		int v_count=0;
		int c_count=0;
		
		String st = str.toLowerCase();
		
		for(int i=0;i<st.length();i++)
		{
			if(ch[i]!=' ')
			{
				if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					v_count++;
				}
				else
					c_count++;
			}
		}
		System.out.println(v_count);
		System.out.println(c_count);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: " );
		String str = sc.nextLine();
		vowel_consonant(str);
		sc.close();
		
	}

}
