package javaFeatures;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo
{
	public static void main(String[] args)
	{
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		String systemDate=format.format(date);
		System.out.println("Today's date and time is: "+systemDate);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	}

}
