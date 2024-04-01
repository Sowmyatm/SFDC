package mock_Interview.practice_2;

import java.util.Scanner;

public class Words_Rev {
	
	public static String words_rev(String str)
	{
	  String rev = "";
	  for(int i=0;i<str.length();i++)
	  {
		  char ch = str.charAt(i);
		  rev=ch+rev;
	  }
	  return rev;
	}
	
	public static void wrds_rev(String str) {
		
	Words_Rev wr = new Words_Rev();
	  str = wr.words_rev(str);
//		
		String strArray[]=str.split("\s+");
		for(int i=0;i<strArray.length;i++) 
		{
			 strArray[i]=wr.words_rev(strArray[i]);
						
		}
		String rev_words = strArray[0];
		for(int i=1;i<strArray.length;i++)
		{
			rev_words=rev_words+" "+strArray[i];
		}
		
		System.out.println(rev_words);
	}
	 
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		words_rev(str);
		wrds_rev(str);	
	} 
}


