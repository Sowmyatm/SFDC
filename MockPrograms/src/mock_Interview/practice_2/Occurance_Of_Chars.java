package mock_Interview.practice_2;

import java.util.HashMap;
import java.util.Map;

public class Occurance_Of_Chars {

	
	public static void occ_char(String str)
	{
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		char ch []=str.toCharArray();
		
		for(char c :ch)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
				charmap.put(c, 1);
		}
		System.out.println(str + charmap);
}
	
	
	public static void main(String[] args) {
		
		
		occ_char("Tesst12");
		occ_char("Teeest");


	}

	
}