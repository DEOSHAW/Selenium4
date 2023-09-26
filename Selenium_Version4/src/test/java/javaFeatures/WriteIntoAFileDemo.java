package javaFeatures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class WriteIntoAFileDemo 
{
	
	public static void main(String args[]) throws Exception
	{
		File fileIn=new File(System.getProperty("user.dir")+File.separator+"Data.txt");
		FileReader fr=new FileReader(fileIn);
		
		BufferedReader br=new BufferedReader(fr);
		
		File fileOut=new File(System.getProperty("user.dir")+File.separator+"DataOutput.txt");
		Writer fw=new FileWriter(fileOut);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		String line="";
		while((line=br.readLine())!=null)
		{
			bw.write(line);
			bw.newLine();
			
		}
		
		br.close();
		fr.close();
		bw.close();
		fw.close();
		
	}

}
