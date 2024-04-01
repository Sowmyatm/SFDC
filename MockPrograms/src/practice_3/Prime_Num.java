package practice_3;

public class Prime_Num {
	
	static boolean is_prime(int num)
	{
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
				return true;
			
			else
				return false;
			
		}
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
			
		if(is_prime(i))
		{
			System.out.println(i + " is Prime");
		}
		else
			System.out.println(i + " is not prime");
	}

}
