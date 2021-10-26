package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToFrame_ID {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/guru99home";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		System.out.println("We are switching to frame ****");
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("WE're done");

	}

}
