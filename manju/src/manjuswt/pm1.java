package manjuswt;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class pm1 {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverpath="C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver ;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("launchingchromedriver browser");
	  System.setProperty("webdriver.chrome.driver",driverpath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
