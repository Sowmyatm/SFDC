package mock_Interview.practice_1;

import java.util.Scanner;

public class Vowels_Consonants {
	
	public static void vowels_consonants(String str)
	{
		
		int v_count =0;
		int c_count=0;
		int count=0;
		
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{	
				if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u') 
				{
					v_count++;
				}
				else
				c_count++;
			
			 count++;
			}
		}System.out.println("Total no of chars: " + count);
		System.out.println("Total no of vowels: " + v_count);
		System.out.println("Total no of consonants: " + c_count);
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str =sc.nextLine();
		
		vowels_consonants(str);
		sc.close();
	}

}
