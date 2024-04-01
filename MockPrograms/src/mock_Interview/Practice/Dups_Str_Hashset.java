package Practice;

import java.util.HashSet;

public class Dups_Str_Hashset {

	public static void main(String[] args) {
		String[] arr= {"Hello", "Hello", "this", "is" ,"javaa", "java","is"};
		
		HashSet <String> langs = new HashSet();
		
		for(String ls:arr)
		{
			if(langs.add(ls)==false)
			{
				System.out.println("Duplicate found " + ls);
			}
			
		}
		
		
		
	}
}