package fre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.IOUtils;

public class Utilities {
	
	public static void main(String args[]) throws Exception
	{
		String rootFolder="C:\\Selenium Projects\\EclipseWorkspace\\FREProject\\datafiles";
		String tarFileName="data2.zip";
		String filePath=rootFolder+File.separator+tarFileName;
		
		
		if(filePath.contains(".tar"))
		{
			extractTar(filePath);
			
		}
		else if(filePath.contains(".zip"))
		{
			extractZip(rootFolder,tarFileName,true);
			
			
		}
		
		
		
	}
	
	
	static void extractZip(String rootFolder,String zipFileName,boolean firstCall) throws Exception
	{
		String rootZipFolder=null;
		String dynamicLocation=null;
		String previousPath=null;
		ArrayList<String> innerFilesArray=new ArrayList<String>();
		FileInputStream fis=null;
		ZipInputStream myZipFile = null;
		String path=rootFolder+File.separator+zipFileName;
		if(firstCall)
		{
		fis = new FileInputStream(path);
        myZipFile = new ZipInputStream(fis);
		}
		
		if(!firstCall)
		{
			
			BufferedReader reader=new BufferedReader(new FileReader(new File(rootFolder+File.separator+"Path.txt")));
			previousPath=reader.readLine();
			path=previousPath+File.separator+zipFileName;
		    fis = new FileInputStream(path);
		    myZipFile = new ZipInputStream(fis);
		    reader.close();
		}
        ZipEntry entry = null;
        int offset=0;
        String[] paths = null;
        FileOutputStream outputFile=null;
		String innerFile = null;
		
		//Getting the root zip folder name
		if(firstCall)
		{
		rootZipFolder=zipFileName.split("\\.")[0];
		File dynamicPath=new File(rootFolder+File.separator+rootZipFolder);
		dynamicPath.mkdir();
		dynamicLocation=dynamicPath.getAbsolutePath();
		}
		else if(!firstCall)
		{
			
			rootZipFolder=zipFileName.split("\\.")[0];
			File dynamicPath=new File(previousPath+File.separator+rootZipFolder);
			dynamicPath.mkdir();
			dynamicLocation=dynamicPath.getAbsolutePath();
			
		}
		
		//Write the path of newly created folder in a text file
		File pathFile=new File(rootFolder+File.separator+"Path.txt");
		BufferedWriter writer=new BufferedWriter(new FileWriter(pathFile));
		writer.write(dynamicLocation);
		writer.close();
		//System.out.println(dynamicLocation);
		//path=dynamicLocation+File.separator+zipFileName;
		
		//Ends here
		while((entry=myZipFile.getNextEntry())!=null)
		 {
			 offset=0;
			 byte[] content = new byte[(int) entry.getSize()];
			 System.out.println(entry.getName()+" "+content.length);
			 innerFile = entry.getName();
			 if(innerFile.contains(".zip"))
			 {
				// System.out.println("There is a zip file: "+innerFile);
				 innerFilesArray.add(innerFile);
				 //File file=new File(System.getProperty("user.dir")+File.separator+"datafiles"+File.separator+innerFile);
				 //file.mkdir();
				// extractZip(tarFilePath+File.separator+innerFile);
			 }
			 myZipFile.read(content, offset, content.length - offset);
             /* Define OutputStream for writing the file */
             //outputFile=new FileOutputStream(new File(dynamicLocation+File.separator+innerFile));
			 if(firstCall)
			 {
             outputFile=new FileOutputStream(new File(dynamicLocation+File.separator+innerFile));
			 }
			 else if(!firstCall)
			 {
				 outputFile=new FileOutputStream(new File(previousPath+File.separator+rootZipFolder+File.separator+innerFile)); 
			 }
             /* Use IOUtiles to write content of byte array to physical file */
             IOUtils.write(content,outputFile);              
             /* Close Output Stream */
             outputFile.close();
             
			 
		 }
		
		
		 myZipFile.close();
		 
		 
		 if(innerFilesArray.size()>0)
			{
			 
				for(int i=0;i<innerFilesArray.size();i++)
				{
					extractZip(rootFolder,innerFilesArray.get(i),false);
				}
			}
		 
		
	}
	
	
	static void extractTar(String tarFilePath) throws Exception
	{
		
		//File file=new File(System.getProperty("user.dir")+File.separator+"datafiles"+File.separator+tarFileName);
		String innerTarFile=null;
		File file=new File(tarFilePath);
		FileInputStream fis=new FileInputStream(file);
		TarArchiveInputStream myTarFile=new TarArchiveInputStream(fis);
		int offset=0;
		TarArchiveEntry entry = null;
		FileOutputStream outputFile=null;
		String innerFile = null;
		ArrayList<String> innerFilesArray=new ArrayList<String>();
		while((entry=myTarFile.getNextTarEntry())!=null)
		 {
			 offset=0;
			 byte[] content = new byte[(int) entry.getSize()];
			 System.out.println(entry.getName()+" "+content.length);
			 innerFile = entry.getName();
			 if(innerFile.contains(".tar"))
			 {
				 System.out.println("There is a tar file: "+innerFile);
				 innerFilesArray.add(innerFile);
				// extractTar(tarFilePath+File.separator+innerFile);
			 }
			 myTarFile.read(content, offset, content.length - offset);
             /* Define OutputStream for writing the file */
             outputFile=new FileOutputStream(new File(System.getProperty("user.dir")+File.separator+"datafiles"+File.separator+innerFile));
             /* Use IOUtiles to write content of byte array to physical file */
             IOUtils.write(content,outputFile);              
             /* Close Output Stream */
             outputFile.close();
             
			 
		 }
		 myTarFile.close();
		 if(innerFilesArray.size()>0)
			{
				for(int i=0;i<innerFilesArray.size();i++)
				{
					extractTar("C:\\Selenium Projects\\EclipseWorkspace\\FREProject\\datafiles"+File.separator+innerFilesArray.get(i));
				}
			}
		 
		 
		 
		
	}
	
	
	
	
	

}
