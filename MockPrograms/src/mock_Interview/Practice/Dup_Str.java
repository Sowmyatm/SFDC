package Practice;

import java.util.HashSet;

public class Dup_Str {

	public static void main(String[] args) {
//		String arr[]= {"Java", "Ruby","C#", "Python", "Ruby","C","Ruby"};
//		String dup[];
//		
//		boolean flag=false;
//		int count =0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Duplicate found " + arr[i]);
//					flag=true;
//					count++;
//					
//				}
//			}
//			
//		}
//		System.out.println("Number of duplicates:" +count);
//		if(flag==false)
//		System.out.println("Duplicate not found");
//			
//	
		
//	String arr[]= {"abcabcabc"};
//		int count=0;
//		boolean flag =false;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("Duplicate found " +arr[i]);
//					count++;
//					flag=true;
//				}
//			}
//		}
//		System.out.println("no of dups:" + count);
//		if(flag==false)
//			System.out.println("dups not found");
		
//		String arr[]= {"C","Python","C#","Java","C++","C","Java","C","Java"};
//		HashSet <String>langs=new HashSet();
//		boolean flag=false;
//		int count=0;
////		System.out.println(langs.add("Java"));
////		System.out.println(langs.add("C"));
////		System.out.println(langs.add("Python"));
////		System.out.println(langs.add("Python"));
//		
//		for(String l :arr)
//		{
//			if(langs.add(l)==false)
//			{
//				System.out.println("Duplicate found " + l);
//				flag=true;
//				count++;
//			}
//		}
//		
//		System.out.println("Dups count " + count);
//		
//		if(flag==false)
//		{
//			System.out.println("Duplicates not found");
//		}
		
		
		String[] arr= {"Hello", "Hello", "this", "is" ,"javaa", "java","is"};
		
		HashSet <String> langs = new HashSet();
		
//		boolean flag=false;
//		int count = 0;
		
		for(String ls:arr) 
		{
			if(langs.add(ls)==false)
			{
				System.out.println("Duplicate found " + ls);
//				flag=true;
//				count++;
			}
		}
		
		
//		System.out.println("Dups count: "+ count);
//		if(flag==false)
//		{
//			System.out.println("Dups not found");
//		}
	}
		
}
