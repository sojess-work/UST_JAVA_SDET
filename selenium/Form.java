package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
	
		WebElement mail = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("passwd"));
		
		mail.sendKeys("abcd@gmail.com");
		pass.sendKeys("abcdefghlkjl");
		System.out.println("Text field set");
		
		mail.clear();
		pass.clear();
		System.out.println("Text field clear");
		
		WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
		
		mail.sendKeys("abcd@gmail.com");
		pass.sendKeys("abcdefghlkjl");
		loginButton.click();
		System.out.println("Login done with click");
		
		driver.get(baseUrl);
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abcdefghlkjl");
		driver.findElement(By.id("SubmitLogin")).submit();
		System.out.println("Login done with submit");
		

	}

}
