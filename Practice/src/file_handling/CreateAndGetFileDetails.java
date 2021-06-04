package file_handling;

import java.io.File;
import java.io.IOException;


public class CreateAndGetFileDetails 
{
	public static void main(String[] args) throws Exception 
	{
		File files=new File("/Users/rbindu/Documents/Testing");
		//System.out.println(files.listFiles());
		for (File file : files.listFiles()) 
		{
			
			System.out.println(file.getAbsoluteFile());
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getParent());
			System.out.println(file.getParentFile());
			
		}
		File file2 = new File("/Users/rbindu/Documents/Testing/Bindu.txt");
		if (file2.createNewFile())
		{
		
			System.out.println("Created  Bindu file ");
		}
		else 
			System.out.println("Already file opened");
	}

	
	
}
