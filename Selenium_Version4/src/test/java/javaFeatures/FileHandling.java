package javaFeatures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {
	
	public static void main(String args[]) throws Exception
	{
		String line="";
		File file_In=new File(System.getProperty("user.dir")+File.separator+"Data.txt");
		File file_Out=new File(System.getProperty("user.dir")+File.separator+"DataOutput.txt");
		FileReader reader=new FileReader(file_In);
		BufferedReader buffReader=new BufferedReader(reader);
		FileWriter writer=new FileWriter(file_Out,true);
		BufferedWriter buffWriter=new BufferedWriter(writer);
		while((line=buffReader.readLine())!=null)
		{
			buffWriter.write(line.replaceAll(" ", "#"));
		}
		
		buffReader.close();
		reader.close();
		buffWriter.close();
		writer.close();
	}

}
