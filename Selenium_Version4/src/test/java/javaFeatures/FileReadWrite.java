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
		BufferedReader br=new BufferedReader(reader);
		StringBuilder sb=new StringBuilder();
		String line="";
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			sb.append(line);
			sb.append("\n");
		}
		br.close();
		reader.close();
		
		File fileWrite=new File(System.getProperty("user.dir")+File.separator+"DataWrite.txt");
		FileWriter fw=new FileWriter(fileWrite,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(sb.toString());
		bw.close();
		fw.close();
		
		
	}
	
	
	
	
	

}
