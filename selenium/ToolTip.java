package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/social-icon.html";
		driver.get(baseUrl);
		
		String expectedTooltip = "Github";
		
		WebElement github = driver.findElement(By.xpath(".//*[@class='socico show-round']/a[4]"));
		String actualTooltip = github.getAttribute("title");
		System.out.println("Actual title of tool tip"+actualTooltip);
		if(actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test case passed");
		}

	}

}
