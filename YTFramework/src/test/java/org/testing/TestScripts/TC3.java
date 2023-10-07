package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testng.annotations.Test;

public class TC3 extends Base {

	@Test
	public void tc1() throws InterruptedException {

		LoginPage login =new LoginPage(driver, pr);
		login.signIn("seleniumportion", "Test@123");
		HomePage home= new HomePage(driver, pr);
		home.clickOnSubscription();
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.clickOnLogoutButton();
	}
}
