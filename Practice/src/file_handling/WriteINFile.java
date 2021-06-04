package file_handling;

import java.io.File;
import java.io.FileWriter;


public class WriteINFile
{
	public static void main(String[] args) throws Exception
	{	
		File singlefile= new File("/Users/rbindu/Documents/Testing/Bindu.txt");		
		System.out.println("Can write - "+singlefile.canWrite());
		System.out.println("Size in bytes "+singlefile.length());
		FileWriter writer=new FileWriter("/Users/rbindu/Documents/Testing/Bindu.txt");
		writer.write("I want to be genius in Java BinduKanthu\nMarride");
		writer.close();
		System.out.println("Successfully written");		
	}
}
