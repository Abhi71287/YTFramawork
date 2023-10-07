package org.testing.utilities;

import org.apache.log4j.xml.DOMConfigurator;

import org.apache.log4j.Logger;

public class LogsCapture {
	
	public static void takeLogs(String className,String msg) {
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger l =Logger.getLogger(className);
		l.info(msg);
	}

}
