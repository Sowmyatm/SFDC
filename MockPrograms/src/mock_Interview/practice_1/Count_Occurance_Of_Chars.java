package mock_Interview.practice_1;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurance_Of_Chars {
	
	static void getcountchars(String name)
	{
		Map<Character,Integer> charmap = new HashMap<Character,Integer>(); 
		
		char strArr[]=name.toCharArray();
		
		for(char c:strArr)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
				charmap.put(c, 1);
		}System.out.println(name +":" +charmap );
	}

	public static void main(String[] args) {

		getcountchars("test");
		getcountchars("test ");
		

	}

}
