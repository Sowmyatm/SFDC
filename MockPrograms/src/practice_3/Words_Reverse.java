package practice_3;

import java.util.Scanner;

public class Words_Reverse {
	
	
	static String str_rev(String str)
	{
		String rev="";
		
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			rev=ch[i]+rev;
			
		}
		System.out.println(rev);
		return rev;
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		
		Words_Reverse wr =new Words_Reverse();
		
		str=wr.str_rev(str);
		
		String strArray[]=str.split("\s+");
		
		for(int i=0;i<strArray.length;i++)
		{
			strArray[i]=wr.str_rev(strArray[i]);
		}
		
		String rev_words=strArray[0];
		
		for(int i=1;i<strArray.length;i++)
		{
			rev_words=rev_words+" "+ strArray[i];
			
		}
		System.out.println(rev_words);
		
		
//		str_rev(str);
		sc.close();

	}

}
