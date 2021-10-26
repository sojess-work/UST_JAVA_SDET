package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://demo.guru99.com/test/link.html";
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("click here")).click();
		System.out.println("Title of the page is " + driver.getTitle());
	}

}
