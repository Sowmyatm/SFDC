package pgms;

public class Min_max {

	public static void min_max(int a[], int min, int max)
	{
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(min + " min");
		System.out.println(max + " max");
		
	}
	
	public static void main(String[] args) {
		
		int a[] = {90,56,2,1,0,100};
		
		int min =a[0];
		int max =a[0];
		
		min_max(a,min,max);
		
		
	}

}
