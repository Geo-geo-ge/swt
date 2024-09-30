package project4;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;




import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverpath="C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver ;
 
  @BeforeTest
  public void launchbrowser() {
	  System.out.println("launchingchromedriver browser");
	  System.setProperty("webdriver.chrome.driver",driverpath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
  }
  @Test
  public void verifyHomepageTitle() {
	  String expectedTitle = "welcome:Mercury Tours";
	  String actualtitle=driver.getTitle();
	  
	  Assert.assertEquals(actualtitle,expectedTitle);
  }
  
  @AfterTest
  public void terminateBrowsert() {
	  driver.close();
  }  

}

