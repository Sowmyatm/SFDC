package practice_3;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurances_Of_Chars 
{
	static void get_count(String str)
	{
		Map<Character, Integer> hm=new HashMap<Character,Integer>();
		char strArray[]=str.toCharArray();
		for(int i=0;i<strArray.length;i++) //for(char c:strArr) can use for each loop also
		{
			if(hm.containsKey(strArray[i]))
			{
				hm.put(strArray[i], hm.get(strArray[i])+1);
			}
			else
				hm.put(strArray[i], 1);
		}
		System.out.println(str + ":" +hm);
		
	}
	
	public static void main(String[] args) 
	{
		get_count("test");
		get_count(" testt");
		get_count("te st ");

	}

}
