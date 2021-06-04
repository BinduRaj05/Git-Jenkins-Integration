package string;

import java.util.HashMap;
import java.util.Set;

public class CountWords_In_String 
{ 
	public static void main(String[] args) 
	{

		String str="Java is is the best Java the great Java";
		//System.out.println(str.length());
		String spiltword[]=str.split(" ");
//System.out.println(spiltword.length);
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for (int i = 0; i < spiltword.length; i++)
		{

			if (hm.containsKey(spiltword[i]))
			{
				hm.put(spiltword[i], hm.get(spiltword[i])+1);
				//System.out.println("Iam map "+hm.get(spiltword[i]));
			}
			else {
				hm.put(spiltword[i], 1);
			}
		}
		System.out.println(hm);
		
		
		
		Set<String> wordsInString=hm.keySet();
		for (String word : wordsInString) 
		{
			if (hm.get(word)>1) 
			{

				System.out.println(word+" : "+hm.get(word));
			}	
		}
	}

}

