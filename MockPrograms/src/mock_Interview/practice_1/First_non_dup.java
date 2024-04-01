package mock_Interview.practice_1;

import java.util.Scanner;

public class First_non_dup {
	
	static void first_non_dup(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i!=j)
				{
					if(ch[i]==ch[j])
					{
						break;
					}
				}
			
				if(j==str.length()-1)
				{
					System.out.println("The first non dup char is :" + ch[i]);
					return;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		first_non_dup(str);
		
		sc.close();
		
		
	}

}
