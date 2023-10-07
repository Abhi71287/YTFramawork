package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {
	
	ChromeDriver driver;
	Properties pr;
public LogoutPage(ChromeDriver driver,Properties pr) {
	this.driver=driver;
	this.pr=pr;
}

public void clickOnLogoutButton() throws InterruptedException {
	WebElement loggedInUserIcon = driver.findElement(By.xpath(pr.getProperty("loggedInUserIcon")));
	loggedInUserIcon.click();
	Thread.sleep(3000);
	WebElement LogoutOption = driver.findElement(By.xpath(pr.getProperty("LogoutOption")));
	LogoutOption.click();
}

}
