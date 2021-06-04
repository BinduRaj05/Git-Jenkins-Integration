package array;

public class LowestNumINArray
{

	public static void main(String[] args)
	{
	
		int [] arr= {2,4,6,33,9,-1,1};
		int value=arr[0];
		for (int i = 0; i < arr.length; i++)
		{
		
			if (arr[i]<value)
			{
			
				value=arr[i];
			}
		}
	System.out.println("The lowest value in the array list is " + value);
	}
}
