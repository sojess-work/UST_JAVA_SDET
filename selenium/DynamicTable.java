package selenium;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/web-table-element.php";
		driver.get(baseUrl);
		
		List cols = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of columns are: " + cols.size());
		
		List rows= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/td[1]"));
		System.out.println("No of rows are: " + rows.size());

	}

}
