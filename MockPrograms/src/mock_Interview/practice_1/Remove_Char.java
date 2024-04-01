package mock_Interview.practice_1;

import java.util.Scanner;


public class Remove_Char {

	
static void char_remove(String str , int a) {
			
			
			String str2  = str.substring(0, a);
			String str3 = str.substring(a+1, str.length());
			
			System.out.println(str2+str3);
		}

		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String str1 = sc.nextLine();

			System.out.println("Enter the index : ");
			int a = sc.nextInt();
				
			
//			Remove_Char str = new Remove_Char();
			char_remove(str1 , a);
			sc.close();

	}

}
