package com.pomandpojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public static WebDriver selhdriver;
	
	public SelectHotelPage(WebDriver driver) {
		this.selhdriver = driver;
		PageFactory.initElements(selhdriver, this);
	}

	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement selectButton;
	
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continueButton;
	
	
	public WebElement getSelectButton() {
		return selectButton;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	

}
