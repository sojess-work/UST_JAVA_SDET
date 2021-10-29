package New;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;
	 @BeforeTest 
	  public void checkWebsite () {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.navigate().to("http://www.calculator.net");
		 d.manage().window().maximize();
	 }
  @Test
  public void f() {
	  d.findElement(By.xpath("/html/body/div[4]/div/table/tbody/tr/td[3]/div[2]/a")).click();
	  d.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	  d.findElement(By.id("cpar1")).sendKeys("10");
	  d.findElement(By.id("cpar2")).sendKeys("50");
	  d.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();	 
	  String result = d.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();
	  System.out.println("Result is "+result);
	  if(result.equals("5")) {
		  System.out.println("The result is pass");
	  }else {
		  System.out.println("The result is fail");
	  }
  }
  

}
