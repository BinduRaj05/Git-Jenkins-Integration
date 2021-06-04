package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read_File
{

	public static void main(String[] args) throws Exception
	{
	
		File file=new File("/Users/rbindu/Documents/Testing/Bindu.txt");
		System.out.println(file.canRead()+" Can Read");
		
//		File file2=new File("/Users/rbindu/Documents/Testing/Bindu.txt");
//		BufferedReader buffer_reader=new BufferedReader(new InputStreamReader(System.in));
//		buffer_reader.readLine();
//		System.out.println("Successfully Read");
		
		FileReader reader=new FileReader(file);
		 char [] a = new char[50];
		System.out.println(reader.read(a)); ;
		 for(char c : a)
	        // System.out.print(c);   // prints the characters one by one
		 reader.close();
		//System.out.println(reader.read());
	}
}
