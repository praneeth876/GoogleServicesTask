package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogUtility {
	String LogFilepath = "C:\\Users\\PraneethReddyKatamre\\Desktop\\Automation Testing\\GoogleServices\\src\\main\\resources\\log4j.properties";
	Logger logger = Logger.getLogger(LogUtility.class);

	public void info(String value) {

		PropertyConfigurator.configure(LogFilepath);
		logger.info(value);
	}

	public void warn(String value) {

		PropertyConfigurator.configure(LogFilepath);
		logger.warn(value);
	}

	public void error(String value) {

		PropertyConfigurator.configure(LogFilepath);
		logger.error(value);
	}

	public void fatal(String value) {

		PropertyConfigurator.configure(LogFilepath);
		logger.fatal(value);
	}

}
