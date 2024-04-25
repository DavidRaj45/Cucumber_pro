package com.adactinstepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactinrunner.AdactinTestRunner;
import com.baseclassmethods.AdactinBaseClass;
import com.pageobjectmanager.AdactinSdp;
import com.pomandpojo.BookAHotelPage;
import com.pomandpojo.LoginPage;
import com.pomandpojo.SearchHotelPage;
import com.pomandpojo.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepdef extends AdactinBaseClass {

	public static WebDriver driver = AdactinTestRunner.driver;
	public static Select select;

//	LoginPage lp = new LoginPage(driver);
//	SearchHotelPage shref = new SearchHotelPage(driver);
//	SelectHotelPage selecthotel = new SelectHotelPage(driver);
//	BookAHotelPage bhref = new BookAHotelPage(driver);
	
	AdactinSdp sdpmanager = new AdactinSdp(driver);

	  @Given("^User Launch The Adactin Application$") public void
	  user_Launch_The_Adactin_Application() throws Throwable {
//	  driver.get("https://adactinhotelapp.com/"); 
	  urlLaunch("https://adactinhotelapp.com/");
	  }
	  
	  @When("^User Enter The Username In Username Field$") public void
	  user_Enter_The_Username_In_Username_Field() throws Throwable { 
//	  WebElement username = driver.findElement(By.id("username"));
//	  username.sendKeys("David7358"); 
//	  lp.getAdactinUsername().sendKeys("David7358"); 
//	  sdpmanager.getLp().getAdactinUsername().sendKeys("David7358");
	  elementSendkeys(sdpmanager.getLp().getAdactinUsername(), "David7358");
	  }
	  
	  @Then("^User Enter The Password In Password Field$") public void
	  user_Enter_The_Password_In_Password_Field() throws Throwable { 
//	  WebElement password = driver.findElement(By.id("password"));
//	  password.sendKeys("David@7358");
//	  lp.getAdactinPasssword().sendKeys("David@7358");
//	  sdpmanager.getLp().getAdactinPasssword().sendKeys("David@7358");
	  elementSendkeys(sdpmanager.getLp().getAdactinPasssword(), "David@7358");
	  }
	  
	  @Then("^User Click On The Login Button And Its Navigate To Search Hotel Page$"
	  ) public void
	  user_Click_On_The_Login_Button_And_Its_Navigate_To_Search_Hotel_Page() throws Throwable { 
//	  WebElement loginbutton = driver.findElement(By.xpath("//input[@name='login']")); 
//	  loginbutton.click();
//	  lp.getLoginButton().click();
//	  sdpmanager.getLp().getLoginButton().click();
	  elmentClick(sdpmanager.getLp().getLoginButton());  
	  }

	@When("^User Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
//		WebElement locationbox = driver.findElement(By.xpath("//select[@name='location']"));

//		select = new Select(locationbox);
//		select = new Select(shref.getLocation());
		select = new Select(sdpmanager.getShref().getLocation());
		
		List<WebElement> availablelocations = select.getOptions();
		System.out.println("all options in location field: ");

		for (WebElement alloptionsinlocation : availablelocations) {
			System.out.println(alloptionsinlocation.getText());
		}
		select.selectByValue("Adelaide");
	}

	@Then("^User Select The Hotel In Hotels Field$")
	public void user_Select_The_Hotel_In_Hotels_Field() throws Throwable {
//		WebElement hotelsbox = driver.findElement(By.id("hotels"));
//		select = new Select(hotelsbox);
		select = new Select(sdpmanager.getShref().getHotels());
		select.selectByIndex(4);
	}

	@Then("^User Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
//		WebElement roomtypebox = driver.findElement(By.xpath("//select[@name='room_type']"));
//		select = new Select(roomtypebox);
//		select = new Select(shref.getRoomType());
		select = new Select(sdpmanager.getShref().getRoomType());
		select.selectByVisibleText("Deluxe");
	}

	@Then("^User Select The Room Count In Number Of Rooms Field$")
	public void user_Select_The_Room_Count_In_Number_Of_Rooms_Field() throws Throwable {
//		WebElement numberofroomsbox = driver.findElement(By.id("room_nos"));
//		select = new Select(numberofroomsbox);
//		select = new Select(shref.getNumberOfRooms());
		select = new Select(sdpmanager.getShref().getNumberOfRooms());
		select.selectByValue("2");
	}

	@Then("^User Select The Date In Check In Date Field$")
	public void user_Select_The_Date_In_Check_In_Date_Field() throws Throwable {
//		WebElement checkindate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
//		checkindate.clear();
//		checkindate.sendKeys("10/02/2024");
//		shref.getCheckInDate().clear();
//		shref.getCheckInDate().sendKeys("10/02/2024");
		sdpmanager.getShref().getCheckInDate().clear();
		sdpmanager.getShref().getCheckInDate().sendKeys("10/02/2024");
	}

	@Then("^User Select The Date In Check Out Date Field$")
	public void user_Select_The_Date_In_Check_Out_Date_Field() throws Throwable {
//		WebElement checkoutdate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
//		checkoutdate.clear();
//		checkoutdate.sendKeys("12/02/2024");
//		shref.getCheckOutDate().clear();
//		shref.getCheckOutDate().sendKeys("12/02/2024");
		sdpmanager.getShref().getCheckOutDate().clear();
		sdpmanager.getShref().getCheckOutDate().sendKeys("12/02/2024");
	}

	@Then("^User Select The Adult Count In Adults per Room Field$")
	public void user_Select_The_Adult_Count_In_Adults_per_Room_Field() throws Throwable {
//		WebElement adultscountbox = driver.findElement(By.xpath("//select[@name='adult_room']"));
//		select = new Select(adultscountbox);
//		select = new Select(shref.getAdultsperRoom());
		select = new Select(sdpmanager.getShref().getAdultsperRoom());
		select.selectByVisibleText("2 - Two");
	}

	@Then("^User Select The Child Count In Childrens per Room Field$")
	public void user_Select_The_Child_Count_In_Childrens_per_Room_Field() throws Throwable {
//		WebElement childrenscountbox = driver.findElement(By.id("child_room"));
//		select = new Select(childrenscountbox);
//		select = new Select(shref.getChildrenperRoom());
		select = new Select(sdpmanager.getShref().getChildrenperRoom());
		select.selectByValue("2");
	}

	@Then("^User Click the Search Button And Its Navigate To Select Hotel Page$")
	public void user_Click_the_Search_Button_And_Its_Navigate_To_Select_Hotel_Page() throws Throwable {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		shref.getSearchButton().click();
		sdpmanager.getShref().getSearchButton().click();
		elmentClick(sdpmanager.getShref().getSearchButton());
	}

	@When("^User Click The Select Hotel Button$")
	public void user_Click_The_Select_Hotel_Button() throws Throwable {
//		WebElement selectbutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
//		selectbutton.click();
//		selecthotel.getSelectButton().click();
//		sdpmanager.getSelecthotel().getSelectButton().click();
		elmentClick(sdpmanager.getSelecthotel().getSelectButton());
	}

	@When("^User Click The Continue Button And Its Navigate To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_Its_Navigate_To_Book_A_Hotel_Page() throws Throwable {
//		WebElement continuebutton = driver.findElement(By.xpath("//input[@name='continue']"));
//		continuebutton.click();
//		selecthotel.getContinueButton().click();
//		sdpmanager.getSelecthotel().getContinueButton().click();
		elmentClick(sdpmanager.getSelecthotel().getContinueButton());
	}

	@When("^User Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
//		driver.findElement(By.id("first_name")).sendKeys("david");
//		bhref.getFirstName().sendKeys("david");
		sdpmanager.getBhref().getFirstName().sendKeys("david");
		elementSendkeys(sdpmanager.getBhref().getFirstName(), "david");
	}

	@Then("^User Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("raj");
//		bhref.getLastName().sendKeys("raj");
		sdpmanager.getBhref().getLastName().sendKeys("raj");
		elementSendkeys(sdpmanager.getBhref().getLastName(), "raj");
	}

	@Then("^User Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
//		driver.findElement(By.id("address")).sendKeys("ranganathapuram,tambaram");
//		bhref.getBillingAddress().sendKeys("ranganathapuram,tambaram");
//		sdpmanager.getBhref().getBillingAddress().sendKeys("ranganathapuram,tambaram");
		elementSendkeys(sdpmanager.getBhref().getBillingAddress(), "ranganathapuram,tambaram");
	}

	@Then("^User Enter The Credit Card No In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("7358091366735809");
//		bhref.getCreditCardNumber().sendKeys("7358091366735809");
//		sdpmanager.getBhref().getCreditCardNumber().sendKeys("7358091366735809");
		elementSendkeys(sdpmanager.getBhref().getCreditCardNumber(), "7358091366735809");
	}

	@Then("^User Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
//		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
//		select = new Select(cardtype);
//		select = new Select(bhref.getCreditCardType());
		select = new Select(sdpmanager.getBhref().getCreditCardType());
		select.selectByValue("VISA");
	}

	@Then("^User Select The Credit Card Expiry Month In Expiry Date Field$")
	public void user_Select_The_Credit_Card_Expiry_Month_In_Expiry_Date_Field() throws Throwable {
//		WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
//		select = new Select(expirymonth);
//		select = new Select(bhref.getExpiryMonth());
		select = new Select(sdpmanager.getBhref().getExpiryMonth());
		select.selectByVisibleText("December");
	}

	@Then("^User Select The Credit Card Expiry Year In Expiry Date Field$")
	public void user_Select_The_Credit_Card_Expiry_Year_In_Expiry_Date_Field() throws Throwable {
//		WebElement expiryear = driver.findElement(By.id("cc_exp_year"));
//		select = new Select(expiryear);
//		select = new Select(bhref.getExpiryYear());
		select = new Select(sdpmanager.getBhref().getExpiryYear());
		select.selectByIndex(20);
	}

	@Then("^User Enter The Cvv Number In CVV Number Field$")
	public void user_Enter_The_Cvv_Number_In_CVV_Number_Field() throws Throwable {
//		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("123");
//		bhref.getCvvNumber().sendKeys("123");
//		sdpmanager.getBhref().getCvvNumber().sendKeys("123");
		elementSendkeys(sdpmanager.getBhref().getCvvNumber(), "123");
		
	}

	@Then("^User Click The Book Now Button And Its Navigate To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_Its_Navigate_To_Booking_Confirmation_Page() throws Throwable {
//		driver.findElement(By.id("book_now")).click();
//		bhref.getBookNowButton().click();
//		sdpmanager.getBhref().getBookNowButton().click();
		elmentClick(sdpmanager.getBhref().getBookNowButton());
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}

	@Then("^User Click The My Ltinerary Button For Check The Booking Hotel$")
	public void user_Click_The_My_Ltinerary_Button_For_Check_The_Booking_Hotel() throws Throwable {
//		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
//		bhref.getMyItineraryButton().click();
//		sdpmanager.getBhref().getMyItineraryButton().click();
		elmentClick(sdpmanager.getBhref().getMyItineraryButton());
	}

}
