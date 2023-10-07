package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	ChromeDriver driver;
	Properties pr;

	public HomePage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}

	public void clickOnTrendings() {
		WebElement Trendinglink = driver.findElement(By.xpath(pr.getProperty("Trendinglink")));
		Trendinglink.click();
	}

	public void clickOnLibrary() {
		WebElement Lib = driver.findElement(By.xpath(pr.getProperty("Lib")));
		Lib.click();
	}

	public void clickOnWatchLater() {
		WebElement Lib = driver.findElement(By.xpath(pr.getProperty("Lib")));
		Lib.click();
	}

	public void clickOnSubscription() {
		WebElement SubscriptionLink = driver.findElement(By.xpath(pr.getProperty("SubscriptionLink")));
		SubscriptionLink.click();
	}

	public void clickOnHistory() {
		WebElement HistoryLink = driver.findElement(By.xpath(pr.getProperty("HistoryLink")));
		HistoryLink.click();
	}

	public void clickOnVideo() throws InterruptedException {
		WebElement video = driver.findElement(By.xpath(pr.getProperty("video")));
		video.click();
		Thread.sleep(3000);
	}

}
