package pgms;

public class Factorial_without_Rec {
	
	public static int fact(int num) {
		
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			if(num==0)
			{
				return 1;
			}
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
	}
	
	public static void main(String[] args) {
		
		int num=5;
		fact(num);
	}
}
