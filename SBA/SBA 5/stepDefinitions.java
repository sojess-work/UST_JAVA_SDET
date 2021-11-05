package StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class stepDefinitions {
	
	WebDriver driver =null;
	@Before
	public void doBefore() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb424\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@After
	public void doAfter() {
		driver.close();
	}
	@Given("the user navigates to {string}")
	public void the_user_navigates_to(String Url) {
		 
		 driver.get(Url);
	}

	@When("Enter email {string} in {string} and password {string} in {string}")
	public void enter_email_and_password(String email, String name1,String password, String name) {
		 
		  driver.findElement(By.name(name1)).sendKeys(email); 
		  driver.findElement(By.name(name)).sendKeys(password);
	}

	@When("Enter confirm password {string}")
	public void enter_confirm_password(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@When("click on {string}")
	public void click_on(String string) {
		 driver.findElement(By.name(string)).click();
	}

	@Then("verify {string} is displayed")
	public void verify_is_displayed(String string) {
	    boolean warning = driver.findElement(By.xpath(string)).isDisplayed();
	    Assert.assertEquals(warning, true);
	    }
	@Then("verify {string} by linktext is displayed")
	public void verify_by_linktext_is_displayed(String linktext) {
		 boolean warning = driver.findElement(By.linkText(linktext)).isDisplayed();
		    Assert.assertEquals(warning, true);
		    }
	
	@Then("check select {string}")
	public void check_select(String xpath) {
		 List<WebElement> options = driver.findElements(By.xpath(xpath));
		 for(int i=0;i<options.size();i++) {
			  options.get(i).click();
			  boolean isSelc = options.get(i).isSelected();
			  Assert.assertEquals(isSelc, true);
		  }
		    }
	
	}
	

