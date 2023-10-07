package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testing.pages.VideoPlayPage;
import org.testng.annotations.Test;

public class TC5 extends Base{

	@Test
	public void tc1() throws InterruptedException {

		LoginPage login =new LoginPage(driver, pr);
		login.signIn("seleniumportion", "Test@123");
		HomePage home= new HomePage(driver, pr);
		home.clickOnVideo();
		VideoPlayPage video =new VideoPlayPage(driver, pr);
		video.clickOnLikeVideo();
		video.clickOnChannelSubscription();
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.clickOnLogoutButton();
	}

}
