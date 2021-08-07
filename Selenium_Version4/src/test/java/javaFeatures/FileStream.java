package javaFeatures;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	
	
	public static void main(String args[]) throws IOException
	{  int count=0;
		//Below code will read an existing file and copy that to a new file
		File file=new File(System.getProperty("user.dir")+File.separator+"Data.txt");
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+File.separator+"DataOutput.txt",true);
		BufferedInputStream brin=new BufferedInputStream(fis); 
		BufferedOutputStream brout=new BufferedOutputStream(fos);
		int data;
		while((data=brin.read())!=-1)
		{
			count++;
			System.out.println("Data is: "+(char)data);
			//brout.write("");
			brout.write(data);
		}
		brin.close();
		brout.close();
		System.out.println("Count is: "+count);
	}

}
