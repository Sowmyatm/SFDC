package mock_Interview.practice_2;

public class To_Check_Prime1_Or_not {
	
	public static boolean is_prime(int n)
	{
	
		 if (n < 1)
		 {
	            return false; 
		 }
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	        {
	            if (n % i == 0) 
	            {
	                return false; 
	            }
	        }
	        return true; 
	        
	}
		
	public static void main(String[] args) {
		
		 if (is_prime(1)) 
	            System.out.println(" true"); 
	        else
	            System.out.println(" false");

	}

}
