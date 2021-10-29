package New;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.testng.Assert;

public class NewTest1 {
	WebDriver d;
	 @BeforeTest 
	  public void checkWebsite () {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.navigate().to("http://demo.guru99.com/test/newtours/");
		 d.manage().window().maximize();
	 }
	 @BeforeMethod
	 public void verifyHomepageTitle() {
		 String expectedTitle ="Welcome: Mercury Tours";
		 String actualTitle = d.getTitle();
		 Assert.assertEquals(expectedTitle, actualTitle);
		 }
	 
  @Test(priority = 0)
  public void register() {
	  d.findElement(By.linkText("REGISTER")).click();
	  String expected ="Register: Mercury Tours";
	  String actual =d.getTitle();
	  Assert.assertEquals(expected, actual);
  }
  @Test(priority = 1)
  public void support() {
	  d.findElement(By.linkText("SUPPORT")).click();
	  String expected ="Under Construction: Mercury Tours";
	  String actual =d.getTitle();
	  Assert.assertEquals(expected, actual);
  }
  @AfterMethod
  public void goBckToHomepage() {
	  d.findElement(By.linkText("Home")).click();
  }
  @AfterTest
  public void terminateBrowser() {
	  d.close();
  }
}
