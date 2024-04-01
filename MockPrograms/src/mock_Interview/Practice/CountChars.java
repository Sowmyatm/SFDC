package mock_Interview.Practice;

import java.util.HashMap;
import java.util.Map;

public class CountChars {

	public static void main(String[] args) {
		
		getcountchars("Test");
		getcountchars("Tesst");
		getcountchars("Testt");
		getcountchars("Test java");
		getcountchars("Test  ");
		getcountchars(" ");
	}
	
	static void getcountchars(String name)
	{
		
		char strArr[]=name.toCharArray();
		
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for(char c:strArr)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
				charmap.put(c, 1);
			
		}System.out.println(name + ":" + charmap);;
	}
}
