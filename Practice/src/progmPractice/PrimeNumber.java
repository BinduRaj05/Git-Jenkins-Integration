package progmPractice;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{

		//int num=1000;
		int n=10;
		boolean flag=false;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)

			{
				if(i%j==0)	

				{ 
					flag=true;
				}
				//else flag=false;

			}
		
			if(flag==true)
			{
				System.out.println("Given number is a prime "+i);

			}
			else
			{
				System.out.println("Given number is not a prime "+i);

			}
		}
	}
}