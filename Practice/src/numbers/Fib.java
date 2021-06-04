package numbers;

import java.util.Scanner;

public class Fib 
{

/*	public static void main(String[] args) 
	{
	
		int fib1=0;
		int fib2=1;
		int fib3;
		int n=5;
		System.out.print(fib1+" "+ fib2);
		for (int i = 0; i <=n; i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(" "+fib3);
		}
	}

*/

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n number : ");
		int n=sc.nextInt();
	
		int fib1=0;
		int fib2=1;
		int fib3;
		
		System.out.print(fib1+" "+fib2);
			for (int j=0; j<=n; j++)
			{
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
				System.out.print(" "+fib3);
			}
			
		
		
	}


}
