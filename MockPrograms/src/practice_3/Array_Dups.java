package practice_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Array_Dups 
{
	static void dup_arr(String arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate found : "+arr[i]);
					count++;
				}
			}
		}
		System.out.println("No of dups: "+ count);
	}
	//using hashmap
	static void dup_arr1(String arr[])
	{
		Map<String,Integer> hm= new HashMap<String,Integer>();
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
//				if(hm.containsKey(arr[i]&& i!=j))
				{
					hm.put(arr[i], hm.get(arr[i])+1);
				}
				
//			else
				hm.put(arr[i], 1);
		}
		}
		System.out.println(hm);
		
	}
	
	//using set
	
	static void dup_Arr2(String arr[])
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
//	
	
	public static void main(String[] args) 
	{
		String arr[]= {"Java","C","Python","C","Java","Java"};
		dup_arr(arr);
	//	dup_arr1(arr);
	//	dup_Arr2(arr);
	}

}
