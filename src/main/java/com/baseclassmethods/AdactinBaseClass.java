package com.baseclassmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBaseClass {

	public static WebDriver driver;

	public static WebDriver browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void urlLaunch(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void elementSendkeys(WebElement element, String key) {
		element.sendKeys(key);
	}

	public static void elmentClick(WebElement element) {
		element.click();
	}

	public static void urlClose() {
		driver.close();
	}
	
	public static void urlQuit() {
		driver.quit();
	}
	
	

}
