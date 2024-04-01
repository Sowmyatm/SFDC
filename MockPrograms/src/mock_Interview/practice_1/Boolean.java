package mock_Interview.practice_1;

public class Boolean {
	
	int atleast_two_bool(boolean a, boolean b, boolean c) {
		
		int num_trues=0;
		if((a||b||c)==false)//checken all vars all false
		{
			return 0;
		
		}
		if(a)
			num_trues++;
		if(b)
			num_trues++;
		if(c)
			num_trues++;
		
		return(num_trues);
		
	}

	public static void main(String[] args) {
		
		Boolean bool = new Boolean();
		
		if(bool.atleast_two_bool(false, false, false)>=2)
			System.out.println("atleast 2 booleans are ture");
		if(bool.atleast_two_bool(true,true, false)>=2)
			System.out.println("atleast 2 booleans are ture");
		if(bool.atleast_two_bool(false, false, true)>=2)
			System.out.println("atleast 2 booleans are ture");
		if(bool.atleast_two_bool(false, false, false)>=2)
			System.out.println("atleast 2 booleans are ture");
		if(bool.atleast_two_bool(false, true, true)>=2)
			System.out.println("atleast 2 booleans are ture");

	}

}
