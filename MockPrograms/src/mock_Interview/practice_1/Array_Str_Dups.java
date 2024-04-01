package mock_Interview.practice_1;

import java.util.HashSet;

public class Array_Str_Dups {
	
	
	static void dup_str(String arr[]) 
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					System.out.println("Duplicate found " + arr[i]);
					count++;
				}
			}
		}System.out.println("Number of dups: " + count);
		
		
}
	
	static void dup_str1(String arr[])
	{
		HashSet<String>langs = new HashSet();
		boolean flag=false;
		int count=0;
		for(String S:arr)
		{
			if(langs.add(S)==false)
			{
				System.out.println("Duplicate found " + S);
				flag = true;
				count++;
			}
				
			
		}
		if(flag==false)
		{
			System.out.println("Duplicate not found");
		}
		System.out.println("Dups count: "+ count);

		
	}

	public static void main(String[] args) 
	{
		
		String arr[] = {"Java","C","Python","C","Hello","Java"};
		//dup_str(arr);
		System.out.println("----------------------");
		dup_str1(arr);
	}

}
