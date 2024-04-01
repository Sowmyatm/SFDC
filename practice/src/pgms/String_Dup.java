package pgms;

import java.util.HashSet;
import java.util.Set;

public class String_Dup {

	public static void main(String[] args) {
		
//		String str[] = {"M", "A", "N", "A", "S", "V", "I", "I"};
//		
//		Set<String> s = new HashSet<String>();
//		for(String name : str)
//			if(s.add(name)==false)
//			{
//				System.out.println(name);
//			}
		
		 int i[]= {1,4,5,7,1,4,5,7};
		 Set<Integer> n = new HashSet<Integer>();
		 for(Integer num : i)
		 {
			 if(n.add(num)==false)
			 {
				 System.out.println(num);
			 }
		 }
		 
		}
	
	
}
