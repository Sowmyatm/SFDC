package practice_3;

import java.util.Scanner;

public class Vowels_Consonants {
	
	static void vowels_consonants(String str)
	{
		int v_count=0;
		int c_count=0;
		int total_count=0;
		
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!=' ')
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					v_count++;
				}
				else
					c_count++;
					total_count++;
			}
			
		}
		System.out.println("Vowel count is: "+v_count);
		System.out.println("Consonants count is : "+ c_count);
		System.out.println("Total no of chars is: "+total_count);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		
		vowels_consonants(str);
		sc.close();
	}

}
