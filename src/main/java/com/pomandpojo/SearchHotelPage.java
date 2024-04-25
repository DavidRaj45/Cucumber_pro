package com.pomandpojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {

	public static WebDriver shdriver;
	
	public SearchHotelPage(WebDriver driver) {
		this.shdriver = driver;
		PageFactory.initElements(shdriver, this);
	}

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement numberOfRooms;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkInDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkOutDate;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultsperRoom;

	@FindBy(id= "child_room")
	private WebElement childrenperRoom;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsperRoom() {
		return adultsperRoom;
	}

	public WebElement getChildrenperRoom() {
		return childrenperRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

}
