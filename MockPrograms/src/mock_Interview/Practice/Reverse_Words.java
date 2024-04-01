package mock_Interview.Practice;

import java.util.Scanner;


public class Reverse_Words {
	
	 String reverse_str(String str)
		{
			String reversed_str="";
			char ch;
			for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i);
				reversed_str=ch+reversed_str;
			}
			return(reversed_str);
		}

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the words to be reversed: ");
			String str = sc.nextLine();
			
			
			Reverse_Words revstr1 = new Reverse_Words();
			
			str=revstr1.reverse_str(str);
			String strArray[] = str.split("\s+");
			
			for(int i=0;i<strArray.length;i++)
			{
				strArray[i]=revstr1.reverse_str(strArray[i]);
			}
			String reverse_words=strArray[0];
			for(int i=1;i<strArray.length;i++)
			{
				reverse_words=reverse_words+" "+strArray[i];
			}
		
			System.out.println(reverse_words);
			sc.close();

	}

}
