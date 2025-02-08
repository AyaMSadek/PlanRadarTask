package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.formsPage;
import pages.homePage;

public class addFieldToForm {
	public WebDriver driver = new ChromeDriver();
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public Actions action = new Actions(driver);

	@BeforeTest
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MSI\\eclipse-workspace\\autpmationTask\\chromedriver.exe");
		login.loginToPlanRadar(driver, wait);
	}

	@Test
	public void addFields() {
		wait.until(ExpectedConditions.elementToBeClickable(homePage.expandSideBarMenuButton(driver)));
		action.moveToElement(homePage.expandSideBarMenuButton(driver)).click().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(homePage.formsAndListsOption(driver)));
		action.moveToElement(homePage.formsAndListsOption(driver)).perform();
		homePage.formsOption(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(formsPage.selectForm(driver)));
        formsPage.selectForm(driver).click();
        
		wait.until(ExpectedConditions.visibilityOf(formsPage.statusField(driver)));
		action.moveToElement(formsPage.statusField(driver)).click().perform();
		action.moveToElement(formsPage.shortTextField(driver)).click().perform();
		wait.until(ExpectedConditions.elementToBeClickable(formsPage.saveButton(driver)));

		formsPage.saveButton(driver).click();
		wait.until(ExpectedConditions.visibilityOf(formsPage.notificationMessage(driver)));
		Assert.assertEquals(true, formsPage.notificationMessage(driver).isDisplayed());
	}
	   @AfterTest  
	   public void after_test()  
	   {  
	      driver.close();
	   }

}
