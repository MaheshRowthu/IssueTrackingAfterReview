package com.virt.logs;

import org.apache.log4j.Logger;

public class LogCalc {
	private static final Logger logger = Logger.getLogger(LogCalc.class);
	// or
	// private static final Logger logger=Logger.getRootLogger();

	public static void main(String[] args) {
		int x = 5, y = 0;
		int z = x + y;
		logger.trace("the value of list item is 5");
		logger.debug("the method was called with the fallowing arguments");
		logger.info("the library was installed or message from the server");
		logger.warn("the library to convert xml weas not found using default");
		// normally in catch block
		logger.error("the exception with values occured");
		logger.fatal("Sorry please restart the system");

		logger.info("Add completed");
		logger.error("error occured");
		logger.debug("Debug message");
		logger.trace("this is trace");
		logger.warn("Warning message");

		
		System.out.println(z);
//		ClassInPkg.main(null);
	}

}
