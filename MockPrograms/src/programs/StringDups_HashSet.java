package programs;

import java.util.HashSet;
import java.util.Set;

public class StringDups_HashSet {
	
	//time complexity O(n)
	//if we use 2 for loops, the time complexity is O(n*n) -> this is the worst approach

//	public static void main(String[] args) {
//		String names[] = {"Java","C","Python","C#","Java","Ruby","C#"};
//		
//	//Set -Set is an interface, part of collection framework - stores only unique elements 
//	//HashSet -class, Set -interface, var is variable of set,
	//hashset is implementing set interface
//		
//		Set<String> var = new HashSet<String>(); 
//		for(String name:names)
//		{
//			if(var.add(name)==false)
//			{
//				System.out.println("duplicate is " + name );
//			}
//		}
//
//	}
	
//	public static void main(String[] args) {
//		
//		 int[] i= {1,3,6,4,5,1,2,6};
//		 
//		 Set<Integer> var = new HashSet<Integer>();
//		 for(Integer num : i) {
//			 if(var.add(num)==false)
//			 {
//				 System.out.println("Duplicate is :" + num);
//			 }
//		 }
//		 
//		
//	}
	
	public static void main(String[] args) {
		
		String names[] = {"A","M","M","A","N","N","A"}; 
		
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			if(store.add(name)==false)
			{
				System.out.println("dup " + name);
			}
		}
		
		
		
	}
	
	
}
	


