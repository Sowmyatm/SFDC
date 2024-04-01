package mock_Interview.practice_2;

import java.util.Scanner;

public class Vowels_Consonants1 {
	
	public static void V_C(String str) {
		
		int v_count=0;
		int co_count=0;
		int ch_count=0;
		
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					v_count++;
				}
				else
					co_count++;
					ch_count++;
			}
		}
		System.out.println("Vowels : " + v_count);
		System.out.println("Consonants : " + co_count);
		System.out.println("Characters : " + ch_count);
		
	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		V_C(str);
		
	}

}
