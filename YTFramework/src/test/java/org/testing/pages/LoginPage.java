package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	ChromeDriver driver;
	Properties pr;
public LoginPage(ChromeDriver driver,Properties pr) {
	this.driver=driver;
	this.pr=pr;
}
	
	public void signIn(String userName ,String password) throws InterruptedException {
		WebElement signInButton = driver.findElement(By.xpath(pr.getProperty("signInButton")));
		signInButton.click();
		WebElement userName1 = driver.findElement(By.xpath(pr.getProperty("userName")));
		userName1.sendKeys(userName);
		WebElement nextButton = driver.findElement(By.xpath(pr.getProperty("nextButton")));
		nextButton.click();
		Thread.sleep(5000);
		WebElement password1 = driver.findElement(By.xpath(pr.getProperty("password")));
		password1.sendKeys(password);
		WebElement nextButton2 = driver.findElement(By.xpath(pr.getProperty("nextButton2")));
		nextButton2.click();
		Thread.sleep(7000);
	}

}
