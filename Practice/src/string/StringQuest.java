package string;

import java.util.HashMap;

public class StringQuest
{

	public static void main(String[] args)
	{
		String str="selenium";
	
		char[] ch=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++)
		{
			if (i%2==0)
			{
				System.out.print(ch[i]);
			}
			else {
				System.out.print("*");
			}
			
		}
	}
}
