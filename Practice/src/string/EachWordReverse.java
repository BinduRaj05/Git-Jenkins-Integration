package string;

public class EachWordReverse 
{

	public static void main(String[] args)
	{
		String str1="The world is beautiful";
		String [] splitWord=str1.split(" ");
		String str3="";
		//HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for (String word:splitWord)
		{
			String str2 = "";
			for (int j = word.length()-1; j>=0; j--) 
			{
				str2=str2+word.charAt(j);
			}
			str3=str3+str2+ " ";
		}

		System.out.println(str1);
		System.out.println(str3);
	}
}
