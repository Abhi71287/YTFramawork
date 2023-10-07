package org.testing.TestScripts;


import java.io.IOException;

import org.testing.Base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Base {


	@Test
	public void tc1() throws InterruptedException, IOException {
        String expectedUrl= "https://www.youtube.com/";
		LoginPage login =new LoginPage(driver, pr);
		login.signIn("seleniumportion", "Test@123");  
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		ScreenshotCapture.takeScreenshots(driver, "../YTFramework/screenshots/1.png");
		LogsCapture.takeLogs("TC1", "Login successFully");
		HomePage home= new HomePage(driver, pr);
		home.clickOnTrendings();
		ScreenshotCapture.takeScreenshots(driver, "../YTFramework/screenshots/2.png");
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.clickOnLogoutButton();
	}
}
 