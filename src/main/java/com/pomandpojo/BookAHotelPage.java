package com.pomandpojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage {
	
	public WebDriver bhdriver;
	
	public BookAHotelPage(WebDriver driver) {
		this.bhdriver = driver;
		PageFactory.initElements(bhdriver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditCardNumber;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement creditCardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id= "cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvNumber;
	
	@FindBy(id = "book_now")
	private WebElement bookNowButton;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myItineraryButton;
	
	

	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	public WebElement getMyItineraryButton() {
		return myItineraryButton;
	}

}
