package javaFeatures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite 
{
	
	public static void main(String[] args) throws IOException
	{
		
		File file=new File(System.getProperty("user.dir")+File.separator+"Data.txt");
		FileReader reader=new FileReader(file);
		BufferedReader buffReader=new BufferedReader(reader);
		
		File file1=new File(System.getProperty("user.dir")+File.separator+"DataOutput.txt");
		FileWriter fw=new FileWriter(file1);
		BufferedWriter bw=new BufferedWriter(fw);
		String line="";
		while((line=buffReader.readLine())!=null)
		{
			
			System.out.println(line);
			
			bw.write(line.replaceAll(" ", "t"));
			
			bw.write("\n");
			
			
		}
		
		buffReader.close();
		reader.close();
		bw.close();
		fw.close();
		
	
		
		
		
	}
	
	
	
	
	

}
