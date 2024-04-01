package pgms;

public class Factorial_Rec {

	public static int fact(int num) {
		
		int temp;
		if(num==0)
		{
			return 1;
			
		}
		else
			temp=num*fact(num-1);
		return temp;
		
	}
	public static void main(String[] args) {
		
		int num=5;
		System.out.println(fact(num));
		
		

	}

}
