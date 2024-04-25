package com.adactinstepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactinrunner.AdactinTestRunner;
import com.baseclassmethods.AdactinBaseClass;
import com.pageobjectmanager.AdactinSdp;
import com.pomandpojo.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinLoginPageStepdef extends AdactinBaseClass {
	
	/*
	public static WebDriver driver = AdactinTestRunner.driver;

	
	AdactinLoginPage lp = new AdactinLoginPage(driver);

	@Given("^User Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
//		driver.get("https://adactinhotelapp.com/");
		urlLaunch("https://adactinhotelapp.com/");
		
	}

	@When("^User Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("David7358");
//		elementSendkeys(username, "David7358");
		elementSendkeys(lp.getAdactinUsername(), "David7358");
	}

	@Then("^User Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("David@7358");
//		elementSendkeys(password, "David@7358");
		elementSendkeys(lp.getAdactinPasssword(), "David@7358");
	}

	@Then("^User Click On The Login Button And Its Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Its_Navigate_To_Search_Hotel_Page() throws Throwable {
//		WebElement loginbutton = driver.findElement(By.xpath("//input[@name='login']"));
//		loginbutton.click();
//		elmentClick(loginbutton);
		elmentClick(lp.getLoginButton());
	}

	@When("^User Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String Usrname) throws Throwable {
		WebElement usernames = driver.findElement(By.id("username"));
//		usernames.sendKeys(Usrname);
		elementSendkeys(usernames, Usrname);
		
	}

	@Then("^User Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String pswrd) throws Throwable {
		WebElement passwords = driver.findElement(By.id("password"));
//		passwords.sendKeys(pswrd);
		elementSendkeys(passwords, pswrd);
		

	}
	*/
	

}
