package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlayPage {

	ChromeDriver driver;
	Properties pr;

	public VideoPlayPage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}

	public void clickOnLikeVideo() {
		WebElement like = driver.findElement(By.xpath(pr.getProperty("like")));
		like.click();
	}

	public void clickOnChannelSubscription() throws InterruptedException {
		WebElement channelSub = driver.findElement(By.xpath(pr.getProperty("channelSub")));
		channelSub.click();
		Thread.sleep(3000);
	}

	public void clickOnCommentSection() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(9000);
		WebElement Comment = driver.findElement(By.xpath(pr.getProperty("Comment")));
		Comment.click();
	}

	public void enterComment(String Comment) {
		WebElement enterComment = driver.findElement(By.xpath(pr.getProperty("enterComment")));
		enterComment.sendKeys(Comment);
	}

	public void clickOnCommentButton() throws InterruptedException {
		WebElement commentButton = driver.findElement(By.xpath(pr.getProperty("commentButton")));
		commentButton.click();
		Thread.sleep(2000);
	}

}
