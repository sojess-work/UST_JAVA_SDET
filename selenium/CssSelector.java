package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		driver.get(baseUrl);
		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
		if(driver.getTitle().equals("Facebook-log in or sign up")) {
			System.out.println("We are back at facebook's homepage");
		}else {
			System.out.println("We are not at facebook's homepage");
		}

	}

}
