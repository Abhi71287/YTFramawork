package org.testing.assertions;

import org.testing.utilities.LogsCapture;

public class Assertion1 {

	public void assertion_1(String expected,String actual,String className) {
	    if(expected.equals(actual))	{
	    	LogsCapture.takeLogs(className, "assertion is getting pass");
	    }else {
	    	LogsCapture.takeLogs(className, "Assertion is getting failed");
	    }
	}
}
