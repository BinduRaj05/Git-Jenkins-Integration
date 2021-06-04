package numbers;

import java.util.Scanner;

public class Fact 
{

/*	public static void main(String[] args)
	{
		int num=5;
		int fact=1;
		for (int i = 1; i<=num; i++) 
		{
			fact=fact*i;
			
		}
		
		System.out.println(fact);
	}
	*/
	
	
	//1 to n
	public static void main(String[] args)
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the n num : ");
		int num=sc.nextInt();
		int fact=1;
		for (int i = 1; i<=num; i++) 
		{
			for (int j = 1; j <=i; j++)
			{
				fact=fact*j;
			}
		System.out.println(i+" factorial is "+fact);
		fact=1;
		
		}
	}
}
