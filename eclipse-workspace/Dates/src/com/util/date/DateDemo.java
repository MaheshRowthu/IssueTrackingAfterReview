package com.util.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args)  {
		//SimpleDateFormat d=new SimpleDateFormat("YYYY-MM-DD");
		Date date1=new Date()	;
		System.out.println("(In Util)Today Date : "+date1);
		
		
//		LocalDate d3=;
//		System.out.println(d3);
		LocalDate date2 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("(In Local Date)Today Date : "+date2);
	}

}
