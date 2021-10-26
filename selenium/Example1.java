package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		String baseUrl = "https://www.facebook.com";
		String tagName = "";
		d.get(baseUrl);
		tagName = d.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		d.close();

		
	}

}
