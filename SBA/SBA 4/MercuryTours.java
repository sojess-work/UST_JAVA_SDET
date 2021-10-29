package New;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryTours {
	WebDriver driver;
	String webDriver ="webdriver.chrome.driver";
	String driverPath ="C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
	String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	
 @BeforeTest
 public void checkWebsite() {
	 System.setProperty(webDriver, driverPath);
	 driver = new ChromeDriver();
	 System.out.println("<-- Connecting to "+ baseURL + " -->");
	 driver.navigate().to(baseURL);
	 System.out.println("<-- Connected -->");
	 String expected = "Register: Mercury Tours";
	 String actual = driver.getTitle();
	 Assert.assertEquals(expected, actual);
 }
	 
  @Test(priority =2 )
  public void checkUserInformation() {
	  driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("12345678");
	  driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
	  driver.findElement(By.name("submit")).click();
	  String expected = "sign-in";
	  String actual =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")).getText();
	  Assert.assertEquals(actual,expected);
  }
  @Test(priority = 0)
  public void checkUserInformationWarning() {
	  
	  driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("12345678");
	  driver.findElement(By.name("confirmPassword")).sendKeys("123456");
	  driver.findElement(By.name("submit")).click();
	  boolean warning = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/span")).isDisplayed();
	  Assert.assertEquals(warning, true);
  }
  @Test(priority = 1)
  public void checkCountryDrpdwn() {
	  List<WebElement> options = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option"));
	  for(int i=0;i<options.size();i++) {
		  options.get(i).click();
		  boolean isSelc = options.get(i).isSelected();
		  Assert.assertEquals(isSelc, true);
	  }
  }
  
  
}
