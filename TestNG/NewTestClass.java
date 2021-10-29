package New;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestClass {
	WebDriver d;
	
	@BeforeTest
	public void checkWebsite() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		d = new ChromeDriver();
		d.navigate().to("https://www.google.com");
	}
  @Test
  public void f() {
	  d.findElement(By.name("q")).sendKeys("Amazon");
  }
}
