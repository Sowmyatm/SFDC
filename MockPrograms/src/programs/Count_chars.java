package programs;

import java.util.Scanner;

public class Count_chars {
	
	public void count_chars(String str)
	{
		int count=0;
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

	//jhkalsjd jakjssjd
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		Count_chars cc= new Count_chars();
		
		
		cc.count_chars(str);
	
	}

}
