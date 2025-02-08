package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	private static WebElement emailField = null;
	private static WebElement passwordField = null;
	private static WebElement continueButton = null;
	private static WebElement loginButton = null;

	public static WebElement emailField(WebDriver driver) {
		emailField = driver.findElement(By.id("email"));
		return emailField;
	}

	public static WebElement continueButton(WebDriver driver) {
		continueButton = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/button"));
		return continueButton;
	}

	public static WebElement passwordField(WebDriver driver) {
		passwordField = driver.findElement(By.id("password"));
		return passwordField;
	}

	public static WebElement pressLoginButton(WebDriver driver) {
		loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/button"));
		return loginButton;
	}
}
