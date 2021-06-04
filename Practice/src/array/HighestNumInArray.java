package array;

public class HighestNumInArray
{

	public static void main(String[] args) 
	{
	
		int [] arr= {23,45,67,3,5,8,44,100};
		int value=arr[0];
		
		for (int i = 0; i < arr.length; i++)
		{
		
			if (arr[i]>value)
			{
			
				value =arr[i];
			}
		
		
		
		}
	
	System.out.println("Largest num in Array is "+value);
	
	}
}
