package mock_Interview.Practice;

public class Print_One_To_Hundred_Without_Using_Integers {
	
	static void one_to_hundred_wthout_int(int one,String s1) {
	
		for(int i=one; i<=(s1.length()*s1.length()); i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		int one  = 'A'/'A';
		String s1= "..........";
		
		one_to_hundred_wthout_int(one,s1);
		
	}

}
