package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelector1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://skptricks.github.io/learncoding/selenium-demo/login%20registration%20page/Register.html";
		driver.get(baseUrl);
		
		driver.findElement(By.cssSelector("input#regUsername")).sendKeys("sumit");
		driver.findElement(By.cssSelector("input#regEmail")).sendKeys("sumit@gmail.com");
		driver.findElement(By.cssSelector("input#regPassword")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input.button.style1.style2")).click();
	}

}
