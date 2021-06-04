package numbers;

public class FactRecursion 
{



	public static int fact(int n)
	{
		int output;
		if (n==1)
		{
		return 1;	
		}
		output=	fact(n-1)*n;
		return output;
		
		
				
	}




	public static void main(String[] args) 
	{
		int factorial =fact(5);
		System.out.println(factorial);
		
	}
}
