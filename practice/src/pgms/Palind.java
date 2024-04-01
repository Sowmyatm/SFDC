package pgms;

public class Palind {
	
	static void palind(String str)
	{
		String org_str = str;
				
		String rev = "";
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			rev=ch[i]+rev;
		}
		System.out.println(rev);
		
		if(org_str.equals(rev))
		{
			System.out.println("Palin");
		}
		else
			System.out.println("not palin");
	}

	public static void main(String[] args) {
		
		String str ="lalal";
		
		palind(str);
	}

	

}
