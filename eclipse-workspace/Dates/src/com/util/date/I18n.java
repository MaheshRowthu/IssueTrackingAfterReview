package com.util.date;

import java.util.Locale;

public class I18n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale=Locale.getDefault();  
		//Locale locale=new Locale("fr","fr");//for the specific locale  
		  
//		System.out.println(locale.getDisplayCountry());  
//		System.out.println(locale.getDisplayLanguage());  
//		System.out.println(locale.getDisplayName());  
		System.out.println(locale.getISO3Country());  
		System.out.println(locale.getISO3Language());  
		System.out.println(locale.getLanguage());  
		System.out.println(locale.getCountry());  
	}

}
