package com.pomandpojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver lpdriver;  //null driver
	
	public LoginPage(WebDriver driver) {
		this.lpdriver = driver;
		PageFactory.initElements(lpdriver, this);
	}
	
	@FindBy(id="username")
	private WebElement adactinUsername;
	
	@FindBy(id="password")
	private WebElement adactinPasssword;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginButton;
	
	public WebElement getAdactinUsername() {
		return adactinUsername;
	}
	public WebElement getAdactinPasssword() {
		return adactinPasssword;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
		
	

}
