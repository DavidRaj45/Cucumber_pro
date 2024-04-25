package com.adactinrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclassmethods.AdactinBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactinfeature"
, glue = "com.adactinstepdefinition"
,tags = ("@LoginPage1,@SearchHotel,@SelectHotelPage,@BookHotelPage")
,plugin = {"html:Report/CucumberAdactin_Report", "pretty", "json:Report/CucumberAdactin.json",
		  "com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"})


public class AdactinTestRunner extends AdactinBaseClass{

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {
		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
//		driver.manage().window().maximize();
		
		driver = browserSetup();
	}
    @AfterClass
	public static void browserClose() {
    	
//		driver.close();
    	
    	urlClose();

	}

}
