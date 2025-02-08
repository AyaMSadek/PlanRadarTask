package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	private static WebElement expandSideBarMenuButton = null;
	private static WebElement formsAndListsOption = null;
	private static WebElement formsOption = null;
	private static WebElement projectsOption = null;

	public static WebElement expandSideBarMenuButton(WebDriver driver) {
		expandSideBarMenuButton = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[3]/div"));
		return expandSideBarMenuButton;
	}

	public static WebElement formsAndListsOption(WebDriver driver) {
		formsAndListsOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[8]"));
		return formsAndListsOption;
	}

	public static WebElement formsOption(WebDriver driver) {
		formsOption = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[8]/div[2]/div/div/a[1]/div"));
		return formsOption;
	}

	public static WebElement projectsOption(WebDriver driver) {
		projectsOption = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[7]"));
		return projectsOption;
	}
}
