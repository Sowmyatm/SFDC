package Practice1;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList ();
		al.add(112);
		al.add(100);
		al.add(300);
		
		System.out.println(al.size());
		
		al.add(39);
		al.add(69);
		
		System.out.println(al.size());
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		al1.add(23);
		al1.add(2);
		al1.add(45);
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("Ammu");
		as.add("Manu");
		as.add("Sowmya");
		
		for(int j=0;j<as.size();j++)
		{
			System.out.println(as.get(j));
		}
		
		
		

	}

}
