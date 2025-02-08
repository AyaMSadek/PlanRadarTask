package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class formsPage {
	private static WebElement createNewFormButton = null;
	private static WebElement formNameField = null;
	private static WebElement statusField = null;
	private static WebElement shortTextField = null;
	private static WebElement saveButton = null;
	private static WebElement notificationMessage = null;
	private static WebElement form = null;
	private static WebElement defaultValueField = null;
	private static WebElement previewFormButton = null;

	public static WebElement createNewFormButton (WebDriver driver)
	{
		createNewFormButton = driver.findElement(By.xpath("//span[ contains (text(), 'Create a new form' ) ]"));
		return createNewFormButton;
	}
	public static WebElement formNameField (WebDriver driver)
	{
		formNameField = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/div[1]/div/input"));
		return formNameField;
	}
	public static WebElement statusField (WebDriver driver)
	{
		statusField = driver.findElement(By.xpath("//span[ contains (text(), 'Status' ) ]"));
		return statusField;
	}
	public static WebElement shortTextField (WebDriver driver)
	{
		shortTextField = driver.findElement(By.xpath("//span[ contains (text(), 'Short Text' ) ]"));
		return shortTextField;
	}
	public static WebElement saveButton (WebDriver driver)
	{
		saveButton = driver.findElement(By.xpath("//span[ contains (text(), 'Save' ) ]"));
		return saveButton;
	}
	public static WebElement notificationMessage (WebDriver driver)
	{
		notificationMessage = driver.findElement(By.id("toast-container"));
		return notificationMessage;
	}
	public static WebElement selectForm (WebDriver driver)
	{
		form = driver.findElement(By.xpath("//span[ contains (text(), 'TestForm' ) ]"));
		return form;
	}
	public static WebElement addDefaultValueField (WebDriver driver)
	{
		defaultValueField = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/aside/div/div[2]/div/div/div/div/div/input"));
		return defaultValueField;
	}
	public static WebElement clickOnPreviewForm (WebDriver driver)
	{
		previewFormButton = driver.findElement(By.xpath("/html/body/div[3]/div/header/div[2]/button[1]"));
		return previewFormButton;
	}
	
}
