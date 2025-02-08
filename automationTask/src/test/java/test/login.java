package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import pages.loginPage;

public class login {

	public static void loginToPlanRadar(WebDriver driver, WebDriverWait wait) {
		driver.get("https://www.planradar.com/login/");
		driver.manage().window().maximize();

		wait.until(ExpectedConditions.elementToBeClickable(loginPage.emailField(driver)));
		loginPage.emailField(driver).sendKeys("ayasadeksaleh@gmail.com");
		loginPage.continueButton(driver).click();
		wait.until(ExpectedConditions.visibilityOf(loginPage.passwordField(driver)));
		loginPage.passwordField(driver).sendKeys("Test123!@#");
		loginPage.pressLoginButton(driver).click();
	}

}
