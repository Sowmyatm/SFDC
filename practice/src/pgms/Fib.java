package pgms;

public class Fib {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int sum =0 ;
		int num=10;
		
		System.out.print(n1 + " " + n2);
		
		for(int i=3; i<=num;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			System.out.print(" " + sum);
		}
		

	}

}
