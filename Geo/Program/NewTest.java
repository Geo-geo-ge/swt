package Program;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}

package Program1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverpath="C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe";
	public Webdriver driver ;
 
  @BeforeTest
  public void launchbrowser() {
	  System.out.println("launchingchromedriver browser");
	  System.setProperty("webdriver.chrome.driver",driverpath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
  }
  @test
  public void verifyHomepageTitle() {
	  String expectedTitle = "welcome:Mercury Tours";
	  String actualtitle=driver.getTitle();
	  
	  Assert.assertEquals(actualTitle,expectedTitle);
  }
  
  @AfterTest
  public void terminateBrowsert() {
	  driver.close();
  }

}

