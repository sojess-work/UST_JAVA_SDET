package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://demo.guru99.com/test/radio.html";
		driver.get(baseUrl);
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		radio1.click();
		System.out.println("Radio 1 clicked");
		
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		radio2.click();
		System.out.println("Radio 2 clicked");
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		if(option1.isSelected()) {
			System.out.println("Checkbox is toggled on");
		}else {
			System.out.println("Checkbox is toggled off");
		}
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement checkFBPersist = driver.findElement(By.id("persist_box"));
		for(int i=0;i<2;i++) {
			checkFBPersist.click();
			System.out.println("Facebook persist status"+ checkFBPersist.isSelected());
		}
	}

}
