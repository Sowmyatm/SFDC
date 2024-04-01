package mock_Interview.Practice;

import java.util.Scanner;

public class Vowels_Consonants_Count {
	
	public static void count_vowel_consonants(String str) {
		
		int vcount=0;
		int ccount=0;
		//int count = 0;
		
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)!=' ')
				{
					if(str.charAt(i)=='a'|| str.charAt(i)== 'e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
					{
						vcount++;
					}
					else 
//						if(str.matches("\\S*([b-df-hj-nq-tv-z]){1,}\\S*"))
						ccount++;
				}
			//count++;
		}
		
		//System.out.println("Total no of characters "+count);
		System.out.println("Vowels count is " +vcount);
		System.out.println("Consonants count is " +ccount);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		String str=sc.nextLine();
		//String str="I Love Learning Java";
		count_vowel_consonants( str);
		sc.close();
	}

}
