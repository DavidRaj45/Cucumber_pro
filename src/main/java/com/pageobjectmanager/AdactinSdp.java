package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.baseclassmethods.AdactinBaseClass;
import com.pomandpojo.BookAHotelPage;
import com.pomandpojo.LoginPage;
import com.pomandpojo.SearchHotelPage;
import com.pomandpojo.SelectHotelPage;

public class AdactinSdp {
	
	public static WebDriver sdpdriver;
	
	public AdactinSdp(WebDriver driver) {
		this.sdpdriver = driver;
	}
	
	private LoginPage lp;
	private SearchHotelPage shref;
	private SelectHotelPage selecthotel;
	private BookAHotelPage bhref;
	

	
	public LoginPage getLp() {
		lp = new LoginPage(sdpdriver);
		return lp;
	}
	
	public SearchHotelPage getShref() {
		shref = new SearchHotelPage(sdpdriver);
		return shref;
	}
	
	public SelectHotelPage getSelecthotel() {
		selecthotel = new SelectHotelPage(sdpdriver);
		return selecthotel;
	}
	
	public BookAHotelPage getBhref() {
		bhref = new BookAHotelPage(sdpdriver);
		return bhref;
	}

}
