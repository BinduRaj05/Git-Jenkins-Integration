package string;

import java.util.HashMap;

public class Identify_Duplicate_Characters
{
	public static void main(String[] args)
	{

		//		String str1="Sakkett";
		//		int length=str1.length();
		//		//System.out.println(length);
		//		char ch[]=str1.toCharArray();
		//		//System.out.println(ch.length);
		//		for (int i = 0; i < str1.length(); i++)
		//		{
		//		
		//			for (int j = i+1; j < str1.length(); j++) 
		//			{
		//				if (ch[i] == ch[j])
		//				{
		//					System.out.println("Duplicate characters are : "+ch[j]);
		//					//ch[j]='0';
		//					break;
		//				}
		//			}
		//		}


		String str1="JaavaMarrva";
		char[] ch=str1.toCharArray();

		HashMap<Character, Integer> map=new HashMap<>();
		for(char c : ch) 
		{
			if(map.containsKey(c)) {

				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		for (char c2 : map.keySet())
		{
			if (map.get(c2)>1) 
			{
			
				System.out.println(c2+" : "+map.get(c2));
			}
			
			
		}


















	}
}
