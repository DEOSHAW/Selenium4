package javaFeatures;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo
{
	
	
	//This method uses Apache POI
		@DataProvider(name="DataSupplierWithPoi")
		//@DataProvider(name="DataSupplierWithPoi",indices = {0,4})
		public Object[][] GetDataForLogin() throws IOException
		{
			
			
			int i,j;
			int row=0;
			int col=0;
	       

	        //HashMap<String[],Object[][]> datamap=new HashMap<String[],Object[][]>();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+File.separator+"SpreadsheetDemo"+".xlsx");
	        XSSFWorkbook wb=new XSSFWorkbook(fis);
	        XSSFSheet sh=wb.getSheetAt(0);
	        row=sh.getLastRowNum();
	        row=row+1;
	        col=sh.getRow(0).getLastCellNum();
	        
	        Object[][] data=new Object[row][col];
	        Object[][] data1=new Object[row-1][col];
	       System.out.println("Values are: ");
	        for(i=0;i<row;i++) {
	            for (j = 0; j < col; j++) {
	                data[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
	                System.out.println(data[i][j]);
	            }
	        }
	        for(i=0;i<row-1;i++)
	            for(j=0;j<col;j++)
	                data1[i][j]=data[i+1][j];

	        for(i=0;i<row-1;i++)
	            for(j=0;j<col;j++)
	                System.out.println(data1[i][j]);

	        //return data1;
	        return data1;


			
		}
	
	@Test(dataProvider ="DataSupplierWithPoi" )
	void getDataFromExcel(String name,String city)
	{
		System.out.println(name+" "+city);
		Assert.assertEquals(name, "Deo Prasad Shaw");
	}
	
	
	

}
