package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInsideFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://chercher.tech/practice/frames";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		System.out.println("Switched to frame1");
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame3);
		System.out.println("Switched to frame3");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(!checkbox.isSelected()) {
			System.out.println("Checkbox is not selected, selecting checkbox....");
			checkbox.click();
			System.out.println("Checkbox is  selected now");
			}

	}

}
