package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;

	@BeforeMethod
	public void before_Method() throws IOException {
		File f= new File("../YTFramework/ObjectRepo.properties");
		FileReader fr =new FileReader(f);
		pr =new Properties();
		pr.load(fr);
		
		driver = new ChromeDriver();
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void after_Method() {
		driver.close();
	}

}
