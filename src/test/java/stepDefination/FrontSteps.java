package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrontSteps {
	
	 WebDriver driver;
	   
	    @Before
	    public void before() {
	    	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();	
	    }
	    @After
	    public void after() throws Exception{
	    	Thread.sleep(2000);
	    	driver.quit();
	    } 
	
	
		@Given("user is on login page")
		public void user_is_on_login_page()  {
			 driver.get("http://demo.frontaccounting.eu/index.php");
		}

		
		@When("user enters usename as {string} & password as {string} & clicks on login")
		public void user_enters_usename_as_password_as_clicks_on_login(String un, String pwd) throws Exception {
			driver.findElement(By.name("user_name_entry_field")).clear();
			driver.findElement(By.name("user_name_entry_field")).sendKeys(un);
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("SubmitUser")).click();
			Thread.sleep(1000);
		  
		}
		
		@Then("login {string} be happen")
		public void login_be_happen(String status) {
			
			if(status.equals("should")) {			
			 if(driver.getTitle().equals("Main Menu")) { 
				System.out.println("Positive Test Pass");
			 }
			else {			
         		System.out.println("Positive Test failed");
				Assert.fail("Positive Test failed");
			}
		   
		}
			else {
				if(driver.getTitle().equals("Main Menu")) {	 
					System.out.println("Negative Test Failed");
					Assert.fail("Negative Test failed");
				 }	
				else {	
					System.out.println("Negative Test pass");
				}
				
				}
			
			
			}
				

}
